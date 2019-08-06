package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class FalseSenseSecurity {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		char[] characters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','_',',','.','?'};
		String[] morse = {".-",	"-...",	"-.-.",	"-..", ".", "..-.",	"--.", "....", "..", ".---", "-.-",	".-..",	"--",
				"-.", "---", ".--.", "--.-", ".-.",	"...", "-",	"..-", "...-", ".--", "-..-", "-.--", "--..", "..--", ".-.-", "---.", "----"};
		Map<Character,String> abcToMorse = new HashMap<Character, String>();
		Map<String,Character> morseToAbc = new HashMap<String, Character>();
		for (int i = 0; i < morse.length; i++) {
			abcToMorse.put(characters[i], morse[i]);
			morseToAbc.put(morse[i], characters[i]);
		}
		String text;
		while ( (text = bi.readLine()) != null){
			StringBuilder encoded = new StringBuilder();
			StringBuilder lengthInfo = new StringBuilder();
			for (int i = 0; i < text.length(); i++) {
				String enc = abcToMorse.get(text.charAt(i));
				encoded.append(enc);
				lengthInfo.append(enc.length());
			}
			lengthInfo.reverse();
			StringBuilder decoded = new StringBuilder();
			int index = 0;
			for (int i = 0; i < lengthInfo.length(); i++) {
				int len = lengthInfo.charAt(i) - '0';
				decoded.append(morseToAbc.get(encoded.substring(index, index + len)));
				index += len;
			}
			System.out.println(decoded);
		}
	}
}
