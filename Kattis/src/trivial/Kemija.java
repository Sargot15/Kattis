package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kemija {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String text = bi.readLine();
		StringBuilder finalText = new StringBuilder();
		for (int i = 0; i < text.length(); i++){
			char c = text.charAt(i);
			finalText.append(c);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') i+= 2;
		}
		System.out.println(finalText.toString());
	}
}
