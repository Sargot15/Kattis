package trivial;

import java.util.Scanner;

public class MixedFractions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true){
			int number = sc.nextInt();
			int div = sc.nextInt();
			if (number == 0 && div == 0)
				break;
			int result = number / div;
			System.out.println(result + " " + (number - result * div) + " / " + div);
		}	
	}
}
