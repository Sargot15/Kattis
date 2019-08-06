package trivial;

import java.util.Scanner;

public class SevenWonders {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] cards = {0,0,0};
		String hand = sc.nextLine();
		for (int i = 0; i < hand.length(); i++){
			switch (hand.charAt(i)){
			case 'T':
				cards[0]++;
				break;
			case 'C':
				cards[1]++;
				break;
			case 'G':
				cards[2]++;
				break;
			}
		}
		int sum = (int)Math.pow(cards[0], 2) + (int)Math.pow(cards[1], 2) + (int)Math.pow(cards[2], 2) + Math.min(Math.min(cards[0], cards[1]), cards[2]) * 7;
		System.out.println(sum);
	}
}
