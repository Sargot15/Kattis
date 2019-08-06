package easy;

import java.util.Scanner;

public class BatterUp {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long bats = sc.nextLong();
        int hits = 0;
        long total = 0;
        for (int i = 0; i < bats; i++){
        	long hit = sc.nextLong();
        	if (hit >= 0){
        		hits++;
        		total += hit;
        	}
        }
        System.out.printf("%.9f",(double)total / (double)hits);
	}
}
