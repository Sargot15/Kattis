package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Hangman {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		char[] word = bi.readLine().toCharArray();
		char[] guesses = bi.readLine().toCharArray();
		int correct = 0, fail = 0;
		Set<Character> charsWord = new HashSet<Character>();
		for (int i = 0; i < word.length; i++) {
			charsWord.add(word[i]);
		}
		for (int i = 0; i < guesses.length; i++) {
			if (charsWord.contains(guesses[i])) correct++;
			else fail++;
			if (correct == charsWord.size()){
				System.out.println("WIN");
				break;
			}
			if (fail == 10){
				System.out.println("LOSE");
				break;
			}
		}
	}
}
