package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vauvau {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] times = bi.readLine().split(" ");
		int aggA = Integer.parseInt(times[0]);
		int calmA = Integer.parseInt(times[1]);
		int aggB = Integer.parseInt(times[2]);
		int calmB = Integer.parseInt(times[3]);
			
		String[] heroes = bi.readLine().split(" ");		
		for (int i = 0; i < heroes.length; i++) {
			int heroe = Integer.parseInt(heroes[i]);
			
			if ((heroe - 1) % (aggA + calmA) < aggA)
				if ((heroe - 1) % (aggB + calmB) < aggB)
					System.out.println("both");
				else
					System.out.println("one");
			else if ((heroe - 1) % (aggB + calmB) < aggB)
				System.out.println("one");
			else 
				System.out.println("none");
		}
	}
}
