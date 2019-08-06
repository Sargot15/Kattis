package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiceGame {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] dices = bi.readLine().split(" ");
		double a1G = Double.parseDouble(dices[0]);
		double b1G = Double.parseDouble(dices[1]);
		double a2G = Double.parseDouble(dices[2]);
		double b2G = Double.parseDouble(dices[3]);
		dices = bi.readLine().split(" ");
		double a1E = Double.parseDouble(dices[0]);
		double b1E = Double.parseDouble(dices[1]);
		double a2E = Double.parseDouble(dices[2]);
		double b2E = Double.parseDouble(dices[3]);
		
		double probG = (double)(b1G + a1G) / 2 + (double)(b2G + a2G) / 2;
		double probE = (double)(b1E + a1E) / 2 + (double)(b2E + a2E) / 2;
		if (probG > probE) System.out.println("Gunnar");
		else if (probG < probE) System.out.println("Emma");
		else System.out.println("Tie");
	}
}
