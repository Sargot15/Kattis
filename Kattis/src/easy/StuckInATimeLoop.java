package easy;

import java.util.Scanner;

public class StuckInATimeLoop {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long times = sc.nextLong();
        for (int i = 1; i <= times; i++){
        	System.out.println(i + " Abracadabra");
        }
	}
}
