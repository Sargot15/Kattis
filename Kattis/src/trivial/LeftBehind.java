package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeftBehind {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		while (true){
			String[] jars = bi.readLine().split(" ");
			int sweet = Integer.parseInt(jars[0]);
			int sour = Integer.parseInt(jars[1]);
			
			if (sweet == 0 && sour == 0)
				break;
			
			if (sweet + sour == 13) System.out.println("Never speak again.");
			else if (sweet > sour) System.out.println("To the convention.");
			else if (sweet < sour) System.out.println("Left beehind.");
			else System.out.println("Undecided.");
		}
	}
}
