package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BoatParts {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] data = bi.readLine().split(" ");
		int parts = Integer.parseInt(data[0]);
		int days = Integer.parseInt(data[1]);
		Set<String> replacements = new HashSet<String>();
		for (int i = 0; i < days; i++) {
			replacements.add(bi.readLine());
			if (replacements.size() == parts) {
				System.out.println(i + 1);
				break;
			}
		}
		if (replacements.size() != parts) {
			System.out.println("paradox avoided");
		}
	}
}
