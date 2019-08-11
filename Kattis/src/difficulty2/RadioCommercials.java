package difficulty2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RadioCommercials {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] data = bi.readLine().split(" ");
		int cost = Integer.parseInt(data[1]);
		
		int max = 0, actual = 0;
		
		String[] peopleCommercial = bi.readLine().split(" ");
		for (int i = 0; i < peopleCommercial.length; i++) {
			int people = Integer.parseInt(peopleCommercial[i]);
			actual = actual - cost + people;
			if (actual > max) max = actual;
			
			if (actual < 0) actual = 0;
		}
		
		System.out.println(max);
	}
}
