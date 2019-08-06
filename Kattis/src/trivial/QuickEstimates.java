package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuickEstimates {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String line = bi.readLine();
		for (int i = 0; i < Integer.parseInt(line); i++){
			String estimate = bi.readLine();
			System.out.println(estimate.length());
		}
	}
}
