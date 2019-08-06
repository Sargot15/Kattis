package easy;

import java.util.Scanner;

public class ConvexPolygonArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numLines = sc.nextLine();
		for (int i = 0; i < Integer.parseInt(numLines); i++){
			int points = sc.nextInt();
			int[][] coords = new int[points][2];
			for ( int j = 0; j < points; j++){
				coords[j][0] = sc.nextInt();
				coords[j][1] = sc.nextInt();
			}
			sc.nextLine();
			int gauss = 0;
			for (int j = 0; j < points; j++){
				gauss += coords[j][0] * coords[(j + 1) % points][1];
				gauss -= coords[(j + 1) % points][0] * coords[j][1];
			}
			System.out.println(Math.abs(gauss) / 2.0);
		}	
		sc.close();
	}
}
