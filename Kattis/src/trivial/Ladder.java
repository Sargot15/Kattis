package trivial;

import java.util.Scanner;

public class Ladder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int angle = sc.nextInt();

		double result = h / Math.sin(Math.toRadians(angle));
		
		System.out.println((int)Math.ceil(result));
	}
}
