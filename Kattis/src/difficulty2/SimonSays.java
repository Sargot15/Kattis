package difficulty2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimonSays {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(bi.readLine());
		
		for (int i = 0; i < cases; i++){
			String sentence = bi.readLine();
			if ( sentence.startsWith("simon says "))
				System.out.println(sentence.substring("simon says ".length(), sentence.length()));
			else
				System.out.println();
		}		
	}
}
