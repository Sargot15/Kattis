package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class QuickBrownFox {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int lines = Integer.parseInt(bi.readLine());
		for (int i = 0; i < lines; i++) {
			Set<Character> letters = new HashSet<Character>();
			letters.add('a');letters.add('b');letters.add('c');letters.add('d');letters.add('e');letters.add('f');
			letters.add('g');letters.add('h');letters.add('i');letters.add('j');letters.add('k');letters.add('l');
			letters.add('m');letters.add('n');letters.add('o');letters.add('p');letters.add('q');letters.add('r');
			letters.add('s');letters.add('t');letters.add('u');letters.add('v');letters.add('w');letters.add('x');
			letters.add('y');letters.add('z');
			String text = bi.readLine();
			for (int j = 0; j < text.length(); j++) {
				char c = text.charAt(j);
				letters.remove(Character.toLowerCase(c));
			}
			if (letters.size() == 0) {
				System.out.println("pangram");
			} else {
				System.out.print("missing ");
				for (Character character : letters) {
					System.out.print(character);
				}
				System.out.println();
			}
		}
	}
}
