package difficulty3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EightQueens {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		boolean valid = true;
		int[] x = new int[8];
		int[] y = new int[8];
		for (int i = 0; i < 8 && valid; i++) {
			String line = bi.readLine();
			for (int j = 0; j < line.length(); j++) {
				if (line.charAt(j) == '*') {
					x[i] = j;
					y[i] = i;
					break;
				}
			}
			for (int j = 0; j < i; j++) {
				if (x[i] == x[j] || y[i] == y[j] || Math.abs(x[i] - x[j]) == Math.abs(y[i] - y[j])){
					valid = false;
					break;
				}
			}
		}
		System.out.println(valid ? "valid" : "invalid");
	}
}
