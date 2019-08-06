package difficulty2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Babelfish {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String text;
		Map<String, String> dictionary = new HashMap<String, String>();
		while (!"".equals((text = bi.readLine()))){
			dictionary.put(text.split(" ")[1], text.split(" ")[0]);
		}
		while ((text = bi.readLine()) != null) {
			String trad = dictionary.get(text);
			if (trad == null)
				System.out.println("eh");
			else
				System.out.println(trad);
		}
	}
}
