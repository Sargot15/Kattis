package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeDPrinterStatues {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int statues = Integer.parseInt(bi.readLine());
		int days = 1;
		int numPrinters = 1;
		if (statues != 1) {
			days++;
			while ((numPrinters) * 2 < statues) {
				numPrinters *= 2;
				days++;
			}
		}
		System.out.println(days);
	}
}
