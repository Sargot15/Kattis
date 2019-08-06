package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SavingForRetirement {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] data = bi.readLine().split(" ");
		int b = Integer.parseInt(data[0]);
		int br = Integer.parseInt(data[1]);
		int bs = Integer.parseInt(data[2]);
		int a = Integer.parseInt(data[3]);
		int as = Integer.parseInt(data[4]);
		
		System.out.println(a + (int)Math.ceil((double)((br - b) * bs +0.1) / as));
	}
}
