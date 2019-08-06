package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sok {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] litres = bi.readLine().split(" ");
		String[] portions = bi.readLine().split(" ");
		double minPortion = Double.MAX_VALUE;
		for (int i = 0; i < litres.length; i++) {
			double portion = Double.parseDouble(litres[i]) / Double.parseDouble(portions[i]);
			if (portion < minPortion) minPortion = portion;
		}
		
		double[] result = new double[3];
		result[0] = Double.parseDouble(litres[0]) - Double.parseDouble(portions[0]) * minPortion;
		result[1] = Double.parseDouble(litres[1]) - Double.parseDouble(portions[1]) * minPortion;
		result[2] = Double.parseDouble(litres[2]) - Double.parseDouble(portions[2]) * minPortion;
		
		System.out.println(result[0] + " " + result[1] + " " + result[2]);
	}
}
