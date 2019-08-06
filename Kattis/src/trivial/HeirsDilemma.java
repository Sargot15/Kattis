package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class HeirsDilemma {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] data = bi.readLine().split(" ");
		int first = Integer.parseInt(data[0]);
		int last = Integer.parseInt(data[1]);
		int count = 0;
		for (int i = first; i <= last; i++) {
			int num = i;
			Set<Integer> digits = new HashSet<Integer>();
			while (num > 0){
				int digit = num % 10;
				if (digit == 0 || i % digit != 0 || digits.contains(digit)) break;;
				digits.add(digit);
				num /= 10;
			}
			if (num <= 0) count++;
		}
		System.out.println(count);
	}
}
