package trivial;

import java.util.Scanner;

public class TakeTwoStones {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long stones = sc.nextLong();
        if (stones % 2 == 0) System.out.println("Bob");
        else System.out.println("Alice");
     }
}
