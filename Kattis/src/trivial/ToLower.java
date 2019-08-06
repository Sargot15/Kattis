package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ToLower {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] data = bi.readLine().split(" ");
		int tests = Integer.parseInt(data[0]);
		int wordsTest = Integer.parseInt(data[1]);
		int testsOK = tests;
		for (int i = 0; i < tests; i++) {
			boolean testOK = true;
			for (int j = 0; j < wordsTest; j++) {
				String word = bi.readLine();
				if (testOK && word.length() > 1 && !word.substring(1).equals(word.substring(1).toLowerCase())) {
					testsOK--;
					testOK = false;
				}
			}
		}
		System.out.println(testsOK);
	}
}
