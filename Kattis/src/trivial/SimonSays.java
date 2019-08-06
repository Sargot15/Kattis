package trivial;

import java.util.Scanner;

public class SimonSays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String lines = sc.nextLine();
		
		for (int i = 0; i < Integer.parseInt(lines); i++){
			String sentence = sc.nextLine();
			if ( sentence.startsWith("Simon says "))
				System.out.println(sentence.substring("Simon says".length(), sentence.length()));
		}		
		sc.close();
	}
}
