package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheOwlAndFox {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(bi.readLine());
		for (int i = 0; i < cases; i++) {
			String numS = bi.readLine();
			char[] digits = numS.toCharArray();
			int num = Integer.parseInt(numS);
			for (int j = 0; j < digits.length; j++) {
				if (digits[digits.length - 1 - j] != '0') {
					num -= Math.pow(10, j);
					break;
				}
			}
			System.out.println(num);	
		}
	}
}
