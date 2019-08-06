package easy;

import java.util.Scanner;

public class BossBattle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pillars = sc.nextInt();
		
		// Each turn we gain a movement from boss, we started with 2 extra "movements" because bombs reach 3 pillars. So the result is pillars - 2.
		System.out.println(Math.max(1, pillars - 2));
	}
}
