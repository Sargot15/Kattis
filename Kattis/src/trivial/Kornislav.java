package trivial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Kornislav {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(sc.nextInt());
		numbers.add(sc.nextInt());
		numbers.add(sc.nextInt());
		numbers.add(sc.nextInt());
		Collections.sort(numbers);
		
		System.out.println(numbers.get(0) * numbers.get(2));
	}
}
