package difficulty2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ADifferentProblem {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = bi.readLine()) != null) {
			String[] numbers = line.split(" ");
			long num1 = Long.parseLong(numbers[0]);
			long num2 = Long.parseLong(numbers[1]);
			
			System.out.println(num1 > num2 ? num1 - num2 : num2 - num1);
		}
	}
}
