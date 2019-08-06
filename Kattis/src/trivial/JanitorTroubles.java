package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JanitorTroubles {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] data = bi.readLine().split(" ");
		int a = Integer.parseInt(data[0]);
		int b = Integer.parseInt(data[1]);
		int c = Integer.parseInt(data[2]);
		int d = Integer.parseInt(data[3]);
		
		double semiperimeter = (double)(a + b + c + d) / 2;
		
		System.out.println(Math.sqrt((semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c) *(semiperimeter - d)));
	}
}
