package trivial;

import java.util.Scanner;

public class Skocimis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] positions = sc.nextLine().split(" ");

		
		System.out.println(Math.max(Integer.parseInt(positions[2]) - Integer.parseInt(positions[1]) - 1, Integer.parseInt(positions[1]) - Integer.parseInt(positions[0]) - 1));
		
		sc.close();
	}
}
