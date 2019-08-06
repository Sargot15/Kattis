package trivial;

import java.util.Scanner;

public class JudgingMoose {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x == y)
			if (x == 0) System.out.println("Not a moose");
			else System.out.println("Even " + (x + y));
		else
			System.out.println("Odd " + Math.max(x, y) * 2);
	}
}
