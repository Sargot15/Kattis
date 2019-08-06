package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyToCryptography {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String ciphertext = bi.readLine();
		StringBuilder key = new StringBuilder(bi.readLine());
		for (int i = 0; i < ciphertext.length(); i++) {
			int desp = ciphertext.charAt(i) - key.charAt(i);
			if ( desp < 0 ) desp += 26;
			char c = (char)('A' + desp);
			key.append(c);
		}
		System.out.println(key.substring(key.length() - ciphertext.length()));
	}
}
