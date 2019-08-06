package difficulty2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AmalgamatedArtichokes {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] data = bi.readLine().split(" ");
		int p = Integer.parseInt(data[0]);
		int a = Integer.parseInt(data[1]);
		int b = Integer.parseInt(data[2]);
		int c = Integer.parseInt(data[3]);
		int d = Integer.parseInt(data[4]);
		int n = Integer.parseInt(data[5]);
		double max = 0;
		double decline = 0;
		for (int k = 1; k <= n; k++) {
			double price = p * (Math.sin(a * k + b) + Math.cos(c * k + d) + 2);
			if (price > max) 
				max = price;
			else
				decline = Math.max(decline, max - price);
		}
		System.out.println(decline);
	}
}
