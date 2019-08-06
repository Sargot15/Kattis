package trivial;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PokerHand {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] hand = sc.nextLine().split(" ");
		Map<Character,Integer> occurrences = new HashMap<Character,Integer>();
		for (int i = 0; i < hand.length; i++){
			char num = hand[i].charAt(0);
			if (occurrences.containsKey(num)) occurrences.put(num, occurrences.get(num) + 1);
			else occurrences.put(num, 1);
		}
		int max = 0;
		for (char c : occurrences.keySet()){
			int occ = occurrences.get(c);
			if (occ > max) max = occ;
		}
		System.out.println(max);
		sc.close();
	}
}
