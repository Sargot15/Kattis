package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bus {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(bi.readLine());
		for(int i = 0; i < cases; i++) {
			int stops = Integer.parseInt(bi.readLine());
			int passengers = 1;
			for (int j = 1; j < stops; j++) {
				passengers = (int)(((double)passengers + 0.5) * 2);
			}
			System.out.println(passengers);
		}
	}
}
