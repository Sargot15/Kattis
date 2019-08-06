package trivial;

import java.util.Scanner;

public class ColdPuterScience {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String temps = sc.nextLine();
		int cont = 0;
		
		for (int i = 0; i < Integer.parseInt(temps); i++){
			int temp = sc.nextInt();
			if (temp < 0) cont++;
		}
		
		System.out.println(cont);
	}
}
