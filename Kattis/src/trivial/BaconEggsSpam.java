package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.TreeSet;

public class BaconEggsSpam {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int cases = Integer.parseInt(bi.readLine());
			if (cases == 0) break;
			TreeMap<String, TreeSet<String>> menu = new TreeMap<String, TreeSet<String>>();
			for( int i = 0; i < cases; i++) {
				String[] orders = bi.readLine().split(" ");
				for (int j = 1; j < orders.length; j++) {
					TreeSet<String> ordersSorted;
					if (menu.containsKey(orders[j])) {
						ordersSorted = menu.get(orders[j]);
					} else {
						ordersSorted = new TreeSet<String>();
					}
					ordersSorted.add(orders[0]);
					menu.put(orders[j], ordersSorted);
				}
				
			}
			for (String food : menu.keySet()) {
				System.out.print(food);
				for (String person : menu.get(food)) {
					System.out.print(" " + person);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
