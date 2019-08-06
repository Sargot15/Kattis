package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BabyBites {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int bites = Integer.parseInt(bi.readLine());
		boolean correct = true;
		String[] bite = bi.readLine().split(" ");
		for (int i = 1; i <= bites; i++) {
			if (!"mumble".equals(bite[i-1]) && Integer.parseInt(bite[i-1]) != i) {
				correct = false;
				break;
			}		
		}
		if (correct)
			System.out.println("makes sense");
		else
			System.out.println("something is fishy");
	}
}
