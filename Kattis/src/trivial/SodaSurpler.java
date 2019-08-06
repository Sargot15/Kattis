package trivial;

import java.util.Scanner;

public class SodaSurpler {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numBottles = sc.nextInt();
		int bottlesDay = sc.nextInt();
		int cost = sc.nextInt();
		numBottles += bottlesDay;
		int canBuy = 0;
		while (numBottles >= cost){
			int buy = numBottles / cost;
			numBottles = numBottles - buy * cost + buy;
			canBuy += buy;
		}
		
		System.out.println(canBuy);
		sc.close();
	}
}
