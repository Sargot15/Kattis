package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kleptography {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] data = bi.readLine().split(" ");
		int n = Integer.parseInt(data[0]);
		int m = Integer.parseInt(data[1]);
		char[] first = bi.readLine().toCharArray();
		char[] second = bi.readLine().toCharArray();
		char[] originalText = new char[m];
		for (int i = 0; i < n; i++) {
			originalText[m - n + i] = first[i];
		}
		
		for (int i = m - n - 1; i >= 0; i--) {
			int desp = second[i + n] - originalText[i + n];
			if (desp < 0) desp +=26;
			char c = (char)('a' + desp);
			originalText[i] = c;
		}
		
		System.out.println(new String(originalText));
	}
}
