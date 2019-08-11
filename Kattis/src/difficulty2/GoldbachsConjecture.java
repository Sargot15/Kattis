package difficulty2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class GoldbachsConjecture {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(bi.readLine());
		List<Integer> numbers = new ArrayList<Integer>(cases);
		int max = 0;
		for (int i = 0; i < cases; i++) {
			int number = Integer.parseInt(bi.readLine());
			numbers.add(number);
			if (number > max) max = number;
		}
		
		BitSet primes = getPrimes(max);
		
		for (int number : numbers) {
			List<String> solutions = new ArrayList<String>();
			int prime = 1;
			while ((prime = primes.nextSetBit(++prime)) <= number / 2 && prime > -1) {
				if (primes.get(number - prime))
					solutions.add(prime + "+" + (number - prime));
			}
			System.out.println(number + " has " + solutions.size() + " representation(s)");
			for (String s : solutions)
				System.out.println(s);
			System.out.println();
		}
	}
	
	// Sieve of Eratosthenes
	private static BitSet getPrimes(int limit) {
		BitSet primes = new BitSet(limit);
		primes.set(0, false);
		primes.set(1, false);
		primes.set(2, limit, true);
		
		for (int i = 2; i * i < limit; i++) {
			if (primes.get(i)) {
				int base = i, mult = 2;
				while (base * mult < limit) {
					primes.set(base * mult++, false);
				}
			}
		}
		
		return primes;
	}
}
