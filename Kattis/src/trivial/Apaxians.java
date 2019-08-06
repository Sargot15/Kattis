package trivial;

import java.util.Scanner;

public class Apaxians {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char lastLetter = ' ';
        for (int i = 0; i < word.length(); i++){
        	if (word.charAt(i) != lastLetter){
        		lastLetter = word.charAt(i);
        		System.out.print(lastLetter);
        	}
        }
	}
}
