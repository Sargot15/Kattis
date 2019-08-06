package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prsteni {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int numRings = Integer.parseInt(bi.readLine());
		String[] rings = bi.readLine().split(" ");
		int firstRing = Integer.parseInt(rings[0]);
		for (int i = 1; i < numRings; i++) {
			int ring = Integer.parseInt(rings[i]);
			int gcd = greatestCommonDivisor(firstRing, ring);
			System.out.println(firstRing / gcd + "/" + ring / gcd);
		}
	}
	
	public static int greatestCommonDivisor(int n1, int n2){
		while (n1 != n2){
			if (n1 > n2) n1 -= n2;
			else n2 -= n1;
		}
		return n1;
	}
}
