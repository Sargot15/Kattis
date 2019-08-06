package difficulty4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class AddingWords {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String text;
		Map<String, Integer> wordsToValue = new HashMap<String, Integer>();
		Map<Integer, String> valuesToWord = new HashMap<Integer, String>();
		while ((text = bi.readLine()) != null) {
			String[] command = text.split(" ");
			switch (command[0]) {
			case "def":
				if (wordsToValue.containsKey(command[1]))
					valuesToWord.remove(wordsToValue.get(command[1]));
				wordsToValue.put(command[1], Integer.parseInt(command[2]));
				valuesToWord.put(Integer.parseInt(command[2]),command[1]);
				break;
			case "calc":
				int result = 0;
				String varResult = "";
				boolean unknown = false;
				System.out.print(text.substring(command[0].length() + 1));
				String var = command[1];
				if (wordsToValue.containsKey(var)) {
					result = wordsToValue.get(var);
					for(int i = 2; i < command.length - 1; i += 2) {
						String oper = command[i];
						var = command[i + 1];
						if (wordsToValue.containsKey(var)) {
							int value = wordsToValue.get(var);
							switch (oper){
							case "+":
								result += value;
								break;
							case "-":
								result -= value;
								break;
							case "=":

								break;
							}
						} else {
							unknown = true;
							break;
						}
					}
				} else {
					unknown = true;
				}
				if (unknown)
					System.out.println(" unknown");
				else {
					if (valuesToWord.containsKey(result)) {
						varResult = valuesToWord.get(result);
						System.out.println(" " + varResult);
					}
					else
						System.out.println(" unknown");
				}
				break;
			case "clear":
				wordsToValue.clear();
				valuesToWord.clear();
				break;
			}
		}
	}
}
