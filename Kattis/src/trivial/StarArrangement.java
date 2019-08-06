package trivial;

import java.util.Scanner;

public class StarArrangement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stars = sc.nextInt();
		System.out.println(stars + ":");
		for (int i = 2; i <= stars / 2 + 1; i++){
			if (stars % (i + (i-1)) == 0 || stars % (i + (i-1)) == i) System.out.println(i + "," + (i - 1));
			if (stars % (i * 2) == 0 || stars % (i * 2) == i) System.out.println(i + "," + i);
		}
		sc.close();
	}
}
