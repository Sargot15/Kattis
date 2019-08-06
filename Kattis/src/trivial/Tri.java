package trivial;

import java.util.Scanner;

public class Tri {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] numbers = sc.nextLine().split(" ");
		int first = Integer.parseInt(numbers[0]);
		int second = Integer.parseInt(numbers[1]);
		int third = Integer.parseInt(numbers[2]);

		if ( first + second == third) System.out.println(first + "+" + second + "=" + third);
		else if ( first - second == third) System.out.println(first + "-" + second + "=" + third);
		else if ( first * second == third) System.out.println(first + "*" + second + "=" + third);
		else if ( first / second == third) System.out.println(first + "/" + second + "=" + third);
		else if ( first == second + third) System.out.println(first + "=" + second + "+" + third);
		else if ( first == second - third) System.out.println(first + "=" + second + "-" + third);
		else if ( first == second * third) System.out.println(first + "=" + second + "*" + third);
		else if ( first == second / third) System.out.println(first + "=" + second + "/" + third);
		
		sc.close();
	}
}
