package difficulty2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArmyStrengthHard {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(bi.readLine());
		for (int i = 0; i < cases; i++) {
			bi.readLine();
			bi.readLine();
			int maxG = -1, maxM = -1;
			String[] strengthsG = bi.readLine().split(" ");
			for (String s : strengthsG) {
				int strength = Integer.parseInt(s);
				if (strength > maxG)
					maxG = strength;
			}
			String[] strengthsM = bi.readLine().split(" ");
			for (String s : strengthsM) {
				int strength = Integer.parseInt(s);
				if (strength > maxM)
					maxM = strength;
			}
			System.out.println(maxG >= maxM ? "Godzilla" : "MechaGodzilla");
		}
	}
}
