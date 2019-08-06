package trivial;

import java.util.Scanner;

public class GoatRope {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		int distX = 0, distY = 0;
		if (x < x1 || x > x2)
			distX = Math.min(Math.abs(x - x1), Math.abs(x - x2));
		if (y < y1 || y > y2)
			distY = Math.min(Math.abs(y - y1), Math.abs(y - y2));
		
		System.out.println(Math.sqrt(Math.pow(distX, 2) + Math.pow(distY, 2)));
	}
}
