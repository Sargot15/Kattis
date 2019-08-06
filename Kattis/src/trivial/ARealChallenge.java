package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ARealChallenge {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		long area = Long.parseLong(bi.readLine());
		
		System.out.println(Math.sqrt(area) * 4);
	}
}
