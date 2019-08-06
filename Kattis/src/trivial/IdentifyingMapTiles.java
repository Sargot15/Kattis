package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IdentifyingMapTiles {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String number = bi.readLine();
		int level = number.length();
		int x = 0, y = 0;
		for (int i = 0; i < level; i++) {
			switch (number.charAt(i)){
				case '1':
					x += Math.pow(2, level - i - 1);
				break;
				case '2':
					y += Math.pow(2, level - i - 1);
				break;
				case '3':
					x += Math.pow(2, level - i - 1);
					y += Math.pow(2, level - i - 1);
				break;
			}
		}
		System.out.println(level + " " + x + " " + y);
	}
}
