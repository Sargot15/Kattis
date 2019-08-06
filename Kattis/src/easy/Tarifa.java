package easy;

import java.util.Scanner;

public class Tarifa {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long data = sc.nextLong();
        long days = sc.nextLong();
        long total = data;
        for (int i = 0; i < days; i++){
        	total += data - sc.nextLong();
        }
        System.out.println(total);
	}
}
