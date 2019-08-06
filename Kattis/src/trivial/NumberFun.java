package trivial;

import java.util.Scanner;

public class NumberFun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String lines = sc.nextLine();
		for (int i = 0; i < Integer.parseInt(lines); i++){
			int first = sc.nextInt();
			int second = sc.nextInt();
			int result = sc.nextInt();
			
			if (first + second == result || Math.max(first, second) - Math.min(first, second) == result
					|| first * second == result || (double)Math.max(first, second) / Math.min(first, second) == result)
				System.out.println("Possible");
			else
				System.out.println("Impossible");
		}
	}
}
