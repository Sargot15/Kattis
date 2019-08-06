package trivial;

import java.util.Calendar;
import java.util.Scanner;

public class Datum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		int month = sc.nextInt();

		Calendar calendar = Calendar.getInstance();
		calendar.set(2009, month - 1, day);
		switch (calendar.get(Calendar.DAY_OF_WEEK)){
		case 1: 
			System.out.println("Sunday");
			break;
		case 2: 
			System.out.println("Monday");
			break;
		case 3: 
			System.out.println("Tuesday");
			break;
		case 4: 
			System.out.println("Wednesday");
			break;
		case 5: 
			System.out.println("Thursday");
			break;
		case 6: 
			System.out.println("Friday");
			break;
		case 7: 
			System.out.println("Saturday");
			break;
		}
		
	}
}
