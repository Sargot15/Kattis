package trivial;

import java.util.Scanner;

public class DetailedDifferences {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String lines = sc.nextLine();

		for (int i = 0; i < Integer.parseInt(lines); i++){
			String first = sc.nextLine();
			String second = sc.nextLine();
			System.out.println(first);
			System.out.println(second);
			for (int j = 0; j < first.length();j++){
				if (first.charAt(j) == second.charAt(j)) System.out.print(".");
				else System.out.print("*");
			}
			System.out.println();
		}
	}
}
