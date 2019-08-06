package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PaulEigon {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] line = bi.readLine().split(" ");
		int numServer = Integer.parseInt(line[0]);
		int pointsA = Integer.parseInt(line[1]);
		int pointsB = Integer.parseInt(line[2]);
		
		System.out.println( ((pointsA + pointsB) / numServer) % 2 == 0 ? "paul" : "opponent");
	}
}
