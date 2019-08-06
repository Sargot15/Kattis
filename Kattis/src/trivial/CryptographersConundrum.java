package trivial;

import java.util.Scanner;

public class CryptographersConundrum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		char[] per = {'P','E','R'};
		int total = 0;
		for (int i = 0; i < word.length(); i++){
			if (word.charAt(i) != per[i%3]) total++;
		}
		
		System.out.println(total);
	}
}
