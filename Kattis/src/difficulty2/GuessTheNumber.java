package difficulty2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessTheNumber {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int min = 1;
		int max = 1001;
		for (int i = 0; i < 10; i++) {
			int guess = (min + max) / 2;
			System.out.println(guess);
			String response = bi.readLine();
			if ("lower".equals(response)) {
				max = guess;
			} else if ("higher".equals(response)) {
				min = guess;
			} else if ("correct".equals(response)) {
				break;
			}
		}
	}
}
