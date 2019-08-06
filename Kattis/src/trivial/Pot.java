package trivial;

import java.util.Scanner;

public class Pot {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long lines = sc.nextLong();
        sc.nextLine();
        long total = 0;
        for (int i = 0; i < lines; i++){
        	String number = sc.nextLine();
        	int base = Integer.parseInt(number.substring(0, number.length() - 1));
        	int pow = Integer.parseInt(number.substring(number.length() - 1, number.length()));
        	total += Math.pow(base, pow);
        }
        System.out.println(total);
	}
}
