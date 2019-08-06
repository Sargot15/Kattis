package trivial;

import java.util.Scanner;

public class TheEasiestProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		while ( (number = sc.nextInt()) != 0){
			int sum = sumDigits(number);
			for (int i = 11; i <= 100; i++){
				if (sum == sumDigits(number * i)){
					System.out.println(i);
					break;
				}
			}
		}
		sc.close();
	}
	
	public static int sumDigits(int num){
		int ret = 0;
		while (num > 0){
			ret += num % 10;
			num /= 10;
		}
		return ret;
	}
}
