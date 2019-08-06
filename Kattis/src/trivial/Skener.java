package trivial;

import java.util.Scanner;

public class Skener {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int zr = sc.nextInt();
		int zc = sc.nextInt();
		sc.nextLine();
		for ( int i = 0; i < r; i++){
			String line = sc.nextLine();
			StringBuilder resultLine = new StringBuilder();
			for ( int j = 0; j < c; j++){
				for ( int k = 0; k < zc; k++)
					resultLine.append(line.charAt(j));
			}
			for (int j = 0; j < zr; j++)
				System.out.println(resultLine);
		}
	}
}
