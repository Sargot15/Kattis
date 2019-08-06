package trivial;

import java.util.Scanner;

public class SumSquaredDigitsFunction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sets = sc.nextLine();
		for (int i = 0; i < Integer.parseInt(sets); i++){
			int set = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			int ssd = 0;
			while (n > 0){
				ssd += Math.pow(n % b, 2);
				n /= b;
			}
			System.out.println(set + " " + ssd);
		}
	}
}
