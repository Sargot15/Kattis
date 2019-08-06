package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DasBlinkenlights {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] data = bi.readLine().split(" ");
		int p = Integer.parseInt(data[0]);
		int q = Integer.parseInt(data[1]);
		int time = Integer.parseInt(data[2]);
		
		int lcm = calculateLCM(Math.max(p, q), Math.min(p, q));
		if (lcm <= time)
			System.out.println("yes");
		else
			System.out.println("no");
	}
	
	public static int calculateLCM(int gr, int ls) {
		if (gr % ls == 0) return gr;
		int aux = gr;
		for (int i = 2; i < ls; i++) {
			aux = gr * i;
			if (aux % ls == 0) return aux;
		}
		return gr * ls;
	}
}
