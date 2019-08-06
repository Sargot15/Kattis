package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beavergnaw {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		while (true) {			
			String[] data = bi.readLine().split(" ");
			int initialD = Integer.parseInt(data[0]);
			int vol = Integer.parseInt(data[1]);
			if (initialD == 0 && vol == 0) break;
			System.out.println(Math.pow(Math.pow(initialD, 3) - 6 * (double)vol / Math.PI, (double)1/3));
		}
	}
}
