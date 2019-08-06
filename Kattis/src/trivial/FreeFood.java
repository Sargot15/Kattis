package trivial;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FreeFood {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String lines = sc.nextLine();
		Set<Integer> days = new HashSet<Integer>();
		for (int i = 0; i < Integer.parseInt(lines); i++){
			int init = sc.nextInt();
			int end = sc.nextInt();
			for (int j = init; j <= end; j++)
				days.add(j);
		}
		System.out.println(days.size());
	}
}
