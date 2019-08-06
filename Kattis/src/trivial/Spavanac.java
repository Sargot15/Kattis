package trivial;

import java.util.Scanner;

public class Spavanac {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minutes = sc.nextInt();
        minutes = minutes - 45;
        if (minutes < 0){
        	minutes += 60;
        	hour -= 1; 
        	if (hour < 0) hour += 24;
        }
        System.out.println(hour + " " + minutes);
	}
}
