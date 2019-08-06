package trivial;

import java.util.Scanner;

public class HarshadNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long number = sc.nextLong();
		for ( long i = number ; i <= 1000000000; i++){
			int sum = 0;
			number = i;
			while (number > 0){
				sum += number % 10;
				number /= 10;
			}
			if ( i % sum == 0){
				System.out.println(i);
				break;
			}
		}
	}
}
