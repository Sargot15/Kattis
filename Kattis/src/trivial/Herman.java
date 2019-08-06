package trivial;

import java.util.Scanner;

public class Herman {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
		
		System.out.println(Math.pow(radius, 2) * Math.PI);
		System.out.println(Math.pow(radius, 2) * 2);
	}
}
