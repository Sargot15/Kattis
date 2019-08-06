package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class SecureDoors {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(bi.readLine());
		Set<String> peopleInside = new HashSet<String>();
		for (int i = 0; i < cases; i++) {
			String[] log = bi.readLine().split(" ");
			String name = log[1];
			if ("entry".equals(log[0])) {
				System.out.print(name + " entered");
				if (peopleInside.contains(log[1]))
					System.out.print(" (ANOMALY)");
				peopleInside.add(name);
			} else {
				System.out.print(name + " exited");
				if (!peopleInside.contains(log[1]))
					System.out.print(" (ANOMALY)");
				peopleInside.remove(name);
			}
			System.out.println();
		}
	}
}
