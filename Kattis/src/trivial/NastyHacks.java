package trivial;

import java.util.Scanner;

public class NastyHacks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String lines = sc.nextLine();
		for (int i = 0; i < Integer.parseInt(lines); i++){
			int rev = sc.nextInt();
			int adv = sc.nextInt();
			int cost = sc.nextInt();
			
			if (rev > adv - cost) System.out.println("do not advertise");
			else if (rev == adv - cost) System.out.println("does not matter");
			else System.out.println("advertise");
			
		}
	}
}
