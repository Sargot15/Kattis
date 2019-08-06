package trivial;

import java.util.Scanner;

public class Oddities {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long lines = sc.nextLong();
        for (int i = 0; i < lines; i++){
        	long number = sc.nextLong();
        	if (number % 2 == 0) System.out.println(number + " is even");
        	else System.out.println(number + " is odd");
        }
	}
}
