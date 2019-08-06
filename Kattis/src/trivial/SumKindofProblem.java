package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumKindofProblem {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(bi.readLine());
		for (int i = 0; i < cases; i++) {
			String[] line = bi.readLine().split(" ");
			int numCase = Integer.parseInt(line[0]);
			int number = Integer.parseInt(line[1]);
			
			int sumOdd = (int) Math.pow(number, 2);
			int sumEven = sumOdd + number;
			int sum = sumEven / 2;
			
			System.out.println(numCase + " " + sum + " " + sumOdd + " " + sumEven);
		}
	}
}
