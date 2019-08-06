package trivial;

import java.util.Scanner;

public class GrassSeedInc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cost = sc.nextDouble();
		int lines = sc.nextInt();
		double total = 0;
		for (int i = 0; i < lines; i++){
			double h = sc.nextDouble();
			double w = sc.nextDouble();
			total += h * w;
		}
		
		System.out.println(cost * total);
	}
}
