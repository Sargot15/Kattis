package trivial;

import java.util.Scanner;

public class Filip {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numbers = sc.nextLine();
		StringBuilder sb = new StringBuilder(numbers).reverse();
		String rev = sb.toString();
		int inv1 = Integer.parseInt(rev.split(" ")[1]);
		int inv2 = Integer.parseInt(rev.split(" ")[0]);
		
		System.out.println(inv1 > inv2 ? inv1 : inv2);
	}
}
