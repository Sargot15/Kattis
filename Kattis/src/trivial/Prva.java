package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prva {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] data = bi.readLine().split(" ");
		int rows = Integer.parseInt(data[0]);
		int cols = Integer.parseInt(data[1]);
		char[][] crossword = new char[rows][cols];
		for (int i = 0; i < rows; i++) {
			crossword[i] = bi.readLine().toCharArray();
		}
		
		StringBuilder shortestWord = new StringBuilder();
		// Check horizontal words
		for (int i = 0; i < rows; i++) {
			StringBuilder word = new StringBuilder();
			for (int j = 0; j < cols; j++) {
				if (crossword[i][j] == '#'){
					if (word.length() > 1 && compareWords(shortestWord.toString(), word.toString()) == 1)
						shortestWord = word;
					word = new StringBuilder();
				} else{
					word.append(crossword[i][j]);
				}
			}
			if (word.length() > 1 && compareWords(shortestWord.toString(), word.toString()) == 1)
				shortestWord = word;
		}
		
		// Check vertical words
		for (int i = 0; i < cols; i++) {
			StringBuilder word = new StringBuilder();
			for (int j = 0; j < rows; j++) {
				if (crossword[j][i] == '#'){
					if (word.length() > 1 && compareWords(shortestWord.toString(), word.toString()) == 1)
						shortestWord = word;
					word = new StringBuilder();
				} else{
					word.append(crossword[j][i]);
				}
			}
			if (word.length() > 1 && compareWords(shortestWord.toString(), word.toString()) == 1)
				shortestWord = word;
		}
		System.out.println(shortestWord);
	}
	/**
	 * Return 0 if first word is lexicographically smaller
	 * Return 1 if first word is lexicographically smaller
	 */
	public static int compareWords(String s1, String s2){
		for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
			if (s1.charAt(i) < s2.charAt(i)) return 0;
			if (s1.charAt(i) > s2.charAt(i)) return 1;
		}
		return s1.length() < s2.length() && s1.length() > 0 ? 0 : 1;
	}
}
