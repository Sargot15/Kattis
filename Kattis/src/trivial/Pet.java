package trivial;

import java.util.Scanner;

public class Pet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxAux = -1;
		int result = -1;
		for (int i = 1; i <= 5; i++){
			int points = 0;
			points += sc.nextInt();
			points += sc.nextInt();
			points += sc.nextInt();
			points += sc.nextInt();
			
			if ( points > maxAux){
				result = i;
				maxAux = points;
			}
		}
		
		System.out.println(result + " " + maxAux);
	}
}
