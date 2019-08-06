package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneChickenPerPerson {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] data = bi.readLine().split(" ");
		int pers = Integer.parseInt(data[0]);
		int chicken = Integer.parseInt(data[1]);
		
		if (pers < chicken)
			System.out.println("Dr. Chaz will have " + (chicken - pers) + (chicken - pers == 1 ? " piece": " pieces") +" of chicken left over!");
		else
			System.out.println("Dr. Chaz needs " + (pers - chicken) + " more " + (pers - chicken == 1 ? "piece": "pieces") + " of chicken!");
	}
}
