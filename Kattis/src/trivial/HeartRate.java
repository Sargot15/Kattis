package trivial;

import java.util.Scanner;

public class HeartRate {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long lines = sc.nextLong();
        for (int i = 0; i < lines; i++){
        	double b = sc.nextDouble();
        	double p = sc.nextDouble();
        	double average = 60 * b / p;
        	System.out.println(average - (average / b) + " " + average + " " + (average + (average / b)));
        }
	}
}
