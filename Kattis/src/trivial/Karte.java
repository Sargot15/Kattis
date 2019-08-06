package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Karte {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String data = bi.readLine();
		Set<String> pDeck = new HashSet<String>();
		Set<String> kDeck = new HashSet<String>();
		Set<String> hDeck = new HashSet<String>();
		Set<String> tDeck = new HashSet<String>();
		boolean repeat = false;
		for (int i = 0; i < data.length() / 3 && !repeat; i++) {
			String card = data.substring(i * 3, i * 3 + 3);
			switch (card.charAt(0)) {
			case 'P':
				if (pDeck.contains(card))
					repeat = true;
				else
					pDeck.add(card);
				break;
			case 'K':
				if (kDeck.contains(card))
					repeat = true;
				else
					kDeck.add(card);
				break;
			case 'H':
				if (hDeck.contains(card))
					repeat = true;
				else
					hDeck.add(card);
				break;
			case 'T':
				if (tDeck.contains(card))
					repeat = true;
				else
					tDeck.add(card);
				break;
			}
		}
		if (repeat)
			System.out.println("GRESKA");
		else {
			System.out.print(13 - pDeck.size() + " ");
			System.out.print(13 - kDeck.size() + " ");
			System.out.print(13 - hDeck.size() + " ");
			System.out.print(13 - tDeck.size() + " ");
			System.out.println();
		}
	}
}
