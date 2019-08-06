package trivial;

import java.util.Scanner;

public class QualityOfLife {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String lines = sc.nextLine();
		double total = 0;
		for (int i = 0; i < Integer.parseInt(lines); i++){
			double quality = sc.nextDouble();
			double period = sc.nextDouble();
			total += quality * period;
		}
		System.out.println(total);
	}
}
