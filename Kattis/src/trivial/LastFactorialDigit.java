package trivial;

import java.util.Scanner;

public class LastFactorialDigit {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long numbers = sc.nextLong();
        for (int i = 0; i < numbers; i++){
        	long fact = sc.nextLong();
        	long result = fact;
        	for (int j = 1; j < fact; j++){
        		result *= j;
        	}
        	System.out.println(result % 10);
        }
	}
}
