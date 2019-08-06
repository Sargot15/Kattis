package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Statistics {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String text;
		int caseNum = 0;
		while ((text = bi.readLine()) != null) {
			caseNum++;
			String[] numbers = text.split(" ");
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			for (int i = 1; i <= Integer.parseInt(numbers[0]); i++) {
				int num = Integer.parseInt(numbers[i]);
				if (num < min) min = num;
				if (num > max) max = num;
			}
			System.out.println("Case " + caseNum + ": " + min + " " + max + " " + (max - min));
		}
	}
}
