package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Relocation {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] lines = bi.readLine().split(" ");
		String[] locationsLine = bi.readLine().split(" ");
		int[] locations = new int[Integer.parseInt(lines[0]) + 1];
		int numLoc = Integer.parseInt(lines[0]); 
		for (int i = 1; i <= numLoc; i++){
			locations[i] = Integer.parseInt(locationsLine[i - 1]);
		}
		int operations = Integer.parseInt(lines[1]);
		for (int i = 0; i < operations; i++){
			String[] operation = bi.readLine().split(" ");
			int op = Integer.parseInt(operation[0]);
			int first = Integer.parseInt(operation[1]);
			int second = Integer.parseInt(operation[2]);	
			if (op == 1){
				locations[first] = second;
			} else{
				int diff = locations[first] - locations[second];
				System.out.println(diff < 0 ? -diff : diff);				
			}			
		}
	}
}
