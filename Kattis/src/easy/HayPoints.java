package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HayPoints {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String,Integer> points = new HashMap<String,Integer>();
		String lines = sc.nextLine();
		for (int i = 0; i < Integer.parseInt(lines.split(" ")[0]); i++){
			String word = sc.nextLine();
			points.put(word.split(" ")[0], Integer.parseInt(word.split(" ")[1]));
		}
		for (int i = 0; i < Integer.parseInt(lines.split(" ")[1]); i++){
			String line = "";
			int sum = 0;
			while(sc.hasNextLine() && !(line = sc.nextLine()).equals(".")){
				String[] words = line.split(" ");
				for (int j = 0; j < words.length; j++)
					if (points.containsKey(words[j]))
						sum += points.get(words[j]);
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
