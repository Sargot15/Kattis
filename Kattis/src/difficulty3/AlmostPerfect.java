package difficulty3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlmostPerfect {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = bi.readLine()) != null) {
			int number = Integer.parseInt(line);
			int sum = 1;
			int max = number / 2 + 1;
			for (int i = 2; i < max; i++) {
				if (number % i == 0) {
					max = number / i;
					sum += i;
					if ( max != i) sum += max;
				}
			}		
			if (sum == number) {
				System.out.println(number + " perfect");
			} else if (Math.abs(number -sum) <= 2){
				System.out.println(number + " almost perfect");
			} else {
				System.out.println(number + " not perfect");
			}
		}
	}
}
