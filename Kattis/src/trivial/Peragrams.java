package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Peragrams {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String word = bi.readLine();
		int[] appearances = new int[26];
		for(int i = 0; i < word.length(); i++) {
			appearances[word.charAt(i) - 'a']++;
		}
		int count = -1;
		for (int i = 0; i < appearances.length; i++) {
			count += appearances[i] % 2;
		}
		
		System.out.println(count == -1 ? 0 : count);
	}
}
