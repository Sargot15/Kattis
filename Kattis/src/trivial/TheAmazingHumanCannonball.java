package trivial;

import java.util.Scanner;

public class TheAmazingHumanCannonball {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tests = sc.nextLine();
		for (int i = 0; i < Integer.parseInt(tests); i++){
			double v = sc.nextDouble();
			double ang = sc.nextDouble();
			double x = sc.nextDouble();
			double h1 = sc.nextDouble();
			double h2 = sc.nextDouble();
			
			double t = x / (v * Math.cos(Math.toRadians(ang)));			
			double y = v * t * Math.sin(Math.toRadians(ang)) - (9.81 * Math.pow(t, 2) / 2);
			
			if ( y >= h1 + 1 && y <= h2 - 1) 	System.out.println("Safe");
			else System.out.println("Not Safe");
		}
	}
}
