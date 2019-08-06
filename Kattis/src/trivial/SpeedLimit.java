package trivial;

import java.util.Scanner;

public class SpeedLimit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sets = 0;
		while ( (sets = sc.nextInt()) >= 0){
			int lastHour = 0;
			int total = 0;
			for ( int i = 0; i < sets; i++){
				int speed = sc.nextInt();
				int hour = sc.nextInt();
				total += speed * (hour - lastHour);
				lastHour = hour;
			}			
			System.out.println(total + " miles");
		}
	}
}
