package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RationalSequence2 {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(bi.readLine());
		for (int i = 0; i < cases; i++) {
			String[] data = bi.readLine().split(" ");
			int p = Integer.parseInt(data[1].split("/")[0]);
			int q = Integer.parseInt(data[1].split("/")[1]);
			System.out.println(data[0] + " " + calculateNode(p,q));
		}
	}
	
	public static int calculateNode(int p, int q){
		int res = 1;
		if (p == 1 && q == 1) return res;
		if (p > q) return calculateNode (p -q, q) * 2 + 1;
		return calculateNode (p, q - p) * 2;
	}
}
