package easy;

import java.util.Scanner;

public class RoamingRomans {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double miles = sc.nextDouble();
        System.out.println(Math.round(miles * 1000 * 5280/4854));
	}
}
