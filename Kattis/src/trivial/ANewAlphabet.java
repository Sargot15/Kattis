package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ANewAlphabet {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] alphabet = {"@", "8", "(", "|)", "3", "#", "6", "[-]", "|", "_|", "|<", "1", "[]\\/[]"
				, "[]\\[]", "0", "|D", "(,)", "|Z", "$", "']['", "|_|", "\\/", "\\/\\/", "}{", "`/", "2"};
		String line = bi.readLine();
		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			if (Character.isLetter(c)) {
				if (Character.isLowerCase(c)) {
					System.out.print(alphabet[c - 'a']);
				} else {
					System.out.print(alphabet[c - 'A']);
				}
			} else {
				System.out.print(c);
			}
		}
	}
}
