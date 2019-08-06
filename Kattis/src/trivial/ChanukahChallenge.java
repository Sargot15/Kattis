package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChanukahChallenge {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(bi.readLine());
		for (int i = 0; i < cases; i++) {
			String[] data = bi.readLine().split(" ");
			int numCase = Integer.parseInt(data[0]);
			int days = Integer.parseInt(data[1]);
			int candles = 0;
			for (int j = 0; j < days; j++) {
				candles += j + 2;
			} 
			System.out.println(numCase + " " + candles);
		}
	}
}
