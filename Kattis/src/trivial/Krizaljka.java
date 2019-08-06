package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Krizaljka {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] words = bi.readLine().split(" ");
		char[] first = words[0].toCharArray();
		char[] second = words[1].toCharArray();
		int rowSolution = -1;
		int colSolution = -1;
		for (int i = 0; i < first.length; i++) {
			for (int j = 0; j < second.length; j++) {
				if (first[i] == second[j]){
					rowSolution = j;
					colSolution = i;
					break;
				}
			}
			if (rowSolution != -1)
				break;
		}
		for (int i = 0; i < second.length; i++) {
			for (int j = 0; j < first.length; j++) {
				if (i == rowSolution) System.out.print(first[j]);
				else if (j == colSolution) System.out.print(second[i]);
				else System.out.print(".");
			}
			System.out.println();
		}
	}
}
