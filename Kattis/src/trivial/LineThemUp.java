package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LineThemUp {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int persons = Integer.parseInt(bi.readLine());
		String lastPerson = "";
		boolean increasing = true;
		boolean decreasing = true;
		for (int i = 0; i < persons; i++) {
			String person = bi.readLine();
			if (i != 0){
				if (compareWords(lastPerson, person) == 0)
					decreasing = false;
				else
					increasing = false;
				
				if (!decreasing && !increasing)
					break;
			}
			lastPerson = person;
		}
		if (increasing) System.out.println("INCREASING");
		else if (decreasing) System.out.println("DECREASING");
		else System.out.println("NEITHER");
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
