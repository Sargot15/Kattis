package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PizzaCrust {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] line = bi.readLine().split(" ");
		int totalR = Integer.parseInt(line[0]);
		int cheeseR = Integer.parseInt(line[1]);
		
		double res = Math.pow(totalR - cheeseR, 2) / Math.pow(totalR, 2) * 100;
		System.out.println(res);
	}
}
