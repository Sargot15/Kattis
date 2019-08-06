package trivial;

import java.util.Scanner;

public class AlphabetSpam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int spaces = 0, lower = 0, upper = 0, other = 0;
		for (int i = 0; i < line.length(); i++){
			char c = line.charAt(i);
			if ( c == '_') spaces++;
			else if (c >= 'a' && c <= 'z') lower++;
			else if (c >= 'A' && c <= 'Z') upper++;
			else other++;
		}
		
		System.out.println((double)spaces/line.length());
		System.out.println((double)lower/line.length());
		System.out.println((double)upper/line.length());
		System.out.println((double)other/line.length());
	}
}
