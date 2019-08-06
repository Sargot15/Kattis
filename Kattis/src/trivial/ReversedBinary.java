package trivial;

import java.util.Scanner;

public class ReversedBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		StringBuilder sb = new StringBuilder(Integer.toBinaryString(number));
		System.out.println(Integer.parseInt(sb.reverse().toString(), 2));	
	}
}
