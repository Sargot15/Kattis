package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LuhnChecksumAlgorithm {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(bi.readLine());
		for (int i = 0; i < cases; i++) {
			char[] number = bi.readLine().toCharArray();
			for (int j = number.length - 2; j >= 0; j-=2) {
				int num = number[j] - '0';
				num *= 2;
				if (num > 9)
					num = num % 10 + 1;
				number[j] =(char)(num + '0');
			}
			int total = 0;
			for (int j = 0; j < number.length; j++) {
				total += number[j] -'0';
			}
			if (total % 10 == 0)
				System.out.println("PASS");
			else
				System.out.println("FAIL");
		}
	}
}
