package trivial;

import java.util.Scanner;

public class Parking2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numLines = sc.nextLine();
		for (int i = 0; i < Integer.parseInt(numLines); i++){
			String numShops = sc.nextLine();
			int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
			for( int j = 0; j < Integer.parseInt(numShops); j++){
				int shop = sc.nextInt();
				if (shop < min ) min = shop;
				if (shop > max ) max = shop;
			}
			System.out.println((max - min) * 2);
			sc.nextLine();
		}
	}
}
