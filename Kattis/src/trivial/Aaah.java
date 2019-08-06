package trivial;

import java.util.Scanner;

public class Aaah {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String able = sc.nextLine();
		String required = sc.nextLine();
		
		System.out.println(able.length() >= required.length() ? "go" : "no");
		
		sc.close();
	}
}
