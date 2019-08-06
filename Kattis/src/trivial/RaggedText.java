package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class RaggedText {
    public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String text;
		int max = -1;
		Stack<Integer> linesLen = new Stack<Integer>();	
		while ((text = bi.readLine()) != null) {
			linesLen.push(text.length());
			if (text.length() > max)
				max = text.length();
		}
		
		int total = 0;
		linesLen.pop();
		while (linesLen.size() > 0) {
			total += (int)Math.pow(max - linesLen.pop(), 2);
		}
		
		System.out.println(total);
	}
}
