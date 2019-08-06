package trivial;

import java.util.Scanner;

public class Rijeci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		int amountA = 1;
		int amountB = 0;
		for (int i = 0; i < times; i++){
			int aux = amountB;
			amountB = amountA + amountB;
			amountA = aux;
		}		
		System.out.println(amountA + " " + amountB);
		sc.close();
	}
}
