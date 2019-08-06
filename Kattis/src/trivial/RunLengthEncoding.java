package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunLengthEncoding {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] line = bi.readLine().split(" ");
		String text = line[1];
		if ("E".equals(line[0])){
			char lastChar = text.charAt(0);
			int repeated = 1;
			for (int i = 1; i < text.length(); i++) {
				char c = text.charAt(i);
				if (lastChar == c) repeated++;
				else {
					System.out.print(lastChar);
					System.out.print(repeated);
					repeated = 1;
					lastChar = c;
				}
			}
			System.out.print(lastChar);
			System.out.print(repeated);
		} else{
			for (int i = 0; i < text.length(); i += 2) {
				char c = text.charAt(i);
				int repetitions = Integer.parseInt(text.substring(i + 1, i + 2));
				for (int j = 0; j < repetitions; j++) {
					System.out.print(c);
				}
			}
		}		
	}
}
