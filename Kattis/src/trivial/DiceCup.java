package trivial;

import java.util.Scanner;

public class DiceCup {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long first = sc.nextLong();
        long second = sc.nextLong();
        for (int i = (int)Math.min(first, second); i <= Math.max(first, second); i++){
        	System.out.println(i + 1);
        }
     }
}
