package difficulty3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class AnotherCandies {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(bi.readLine());
		for (int i = 0; i < cases; i++) {
			bi.readLine();
			BigInteger numbers = new BigInteger(bi.readLine());
			BigInteger total = new BigInteger("0");
			for (int j = 0; j < numbers.intValue(); j++) {
				BigInteger num = new BigInteger(bi.readLine());
				total = total.add(num);
			}
			System.out.println(total.mod(numbers).intValue() == 0 ? "YES" : "NO");
		}
	}
}
