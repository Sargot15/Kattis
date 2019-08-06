package trivial;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Everywhere {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numLines = sc.nextLine();
		for (int i = 0; i < Integer.parseInt(numLines); i++){
			String numCities = sc.nextLine();
			Set<String> cities = new HashSet<String>();
			for( int j = 0; j < Integer.parseInt(numCities); j++){
				cities.add(sc.nextLine());
			}
			System.out.println(cities.size());
		}
	}
}
