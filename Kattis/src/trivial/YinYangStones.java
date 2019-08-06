package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YinYangStones {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		char[] stones = bi.readLine().toCharArray();
		int countW  =0;
		int countB  =0;
		for (int i = 0; i < stones.length; i++) {
			if (stones[i] == 'W') countW++;
			else countB++;
		}
		System.out.println(countB == countW ? 1 : 0);
	}
}
