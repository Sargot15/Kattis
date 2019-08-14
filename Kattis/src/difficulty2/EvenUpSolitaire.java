package difficulty2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class EvenUpSolitaire {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String number = bi.readLine();
		String[] cards = bi.readLine().split(" ");
		Stack<Integer> remainingCards = new Stack<Integer>();
		for (int i = 0; i < cards.length; i++) {
			int card = Integer.parseInt(cards[i]);
			if (remainingCards.size() == 0 || remainingCards.peek() != card % 2)
				remainingCards.push(card % 2);
			else
				remainingCards.pop();
		}
		
		System.out.println(remainingCards.size());
	}
}
