package difficulty2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backspace {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		char[] text = bi.readLine().toCharArray();
		StringBuilder finalText = new StringBuilder();
		for (int i = 0; i < text.length; i++) {
			char c = text[i];
			if (c == '<')
				finalText.deleteCharAt(finalText.length() - 1);
			else 
				finalText.append(c);
		}
		System.out.print(finalText);
	}
}
