package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soylent {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(bi.readLine());
		for (int i = 0; i < cases; i++) {
			int calories = Integer.parseInt(bi.readLine());
			System.out.println(calories % 400 == 0 ? calories / 400 : calories / 400 + 1);
		}
	}
}
