package trivial;

import java.util.Scanner;

public class Railroad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int junctions = sc.nextInt();
		int switches = sc.nextInt();
		
		if (switches %2 == 0) System.out.println("possible");
		else System.out.println("impossible");
		
	}
}
