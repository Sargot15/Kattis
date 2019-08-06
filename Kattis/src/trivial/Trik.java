package trivial;

import java.util.Scanner;

public class Trik {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String moves = sc.nextLine();
		int result = 1;
		for (int i = 0; i < moves.length(); i++){
			switch (moves.charAt(i)){
				case 'A':
					if (result == 1) result = 2;
					else if (result == 2) result = 1;
				break;
				case 'B':
					if (result == 2) result = 3;
					else if (result == 3) result = 2;
				break;
				case 'C':
					if (result == 1) result = 3;
					else if (result == 3) result = 1;
				break;
			}
		}
		System.out.println(result);
	}
}
