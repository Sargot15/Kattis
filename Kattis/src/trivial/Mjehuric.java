package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mjehuric {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] numbersString = bi.readLine().split(" ");
		int[] numbers = new int[numbersString.length];
		for (int i = 0; i < numbersString.length; i++) {
			numbers[i] = Integer.parseInt(numbersString[i]);
		}
		boolean sorted = false;
		while (!sorted){
			sorted = true;
			for (int i = 1; i < numbers.length; i++) {
				if (numbers[i] < numbers[i - 1]){
					int aux = numbers[i - 1];
					numbers[i - 1] = numbers[i];
					numbers[i] = aux;
					for (int j = 0; j < numbers.length; j++){
						System.out.print(numbers[j] + " ");
						if (numbers[j] != j + 1)
							sorted = false;
					}
					System.out.println();
				}
			}
		}
	}
}
