package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class ConquestCampaign {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String [] data = bi.readLine().split(" ");
		int r = Integer.parseInt(data[0]);
		int c = Integer.parseInt(data[1]);
		int initialAttack = Integer.parseInt(data[2]);
		Set<Integer> attacked = new HashSet<Integer>();
		for (int i = 0; i < initialAttack; i++) {
			String [] cell = bi.readLine().split(" ");
			int x = Integer.parseInt(cell[0]) - 1;
			int y = Integer.parseInt(cell[1]) - 1;
			
			attacked.add(x * c + y);
		}
		int days = 1;
		Set<Integer> justAttacked = attacked;
		while (attacked.size() < r * c){
			Set<Integer> toAttack = new HashSet<Integer>();
			for (int cell : justAttacked) {
				// North
				if (cell >= c) toAttack.add(cell - c);
				// South
				if (cell < r * c - c) toAttack.add(cell + c);
				// West
				if (cell % c != 0) toAttack.add(cell - 1);
				// East
				if (cell % c != c - 1) toAttack.add(cell + 1);
			}			
			attacked.addAll(toAttack);
			justAttacked = toAttack;
			days++;
		}
		
		System.out.println(days);
	}
}
