package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ptice {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		bi.readLine();
		char[] answers = bi.readLine().toCharArray();
		int totalAdrian = 0, totalBruno = 0, totalGoran = 0;
		for (int i = 0; i < answers.length; i++){
			char answer = answers[i];
			if (answer == 'A' && i % 3 == 0 || answer == 'B' && i % 3 == 1 || answer == 'C' && i % 3 == 2) totalAdrian++;
			if (answer == 'B' && i % 2 == 0 || answer == 'C' && i % 4 == 3 || answer == 'A' && i % 4 == 1) totalBruno++;
			if (answer == 'C' && (i / 2) % 3 == 0 || answer == 'A' && (i / 2) % 3 == 1 || answer == 'B' && (i / 2) % 3 == 2) totalGoran++;
		}
		int max = Math.max(Math.max(totalAdrian, totalBruno), totalGoran);
		System.out.println(max);
		if ( max == totalAdrian) System.out.println("Adrian");
		if ( max == totalBruno) System.out.println("Bruno");
		if ( max == totalGoran) System.out.println("Goran");
	}
}
