package difficulty2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class EngineeringEnglish {
    public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String text;
		Set<String> dictionary = new HashSet<String>();
		while ((text = bi.readLine()) != null) {
			String[] words = text.split(" ");
			for (String word : words) {
				if (dictionary.contains(word.toLowerCase())) {
					System.out.print(". ");
				} else {
					System.out.print(word + " ");
					dictionary.add(word.toLowerCase());
				}
			}
			System.out.println();
		}
    }
}
