package trivial;

import java.util.Scanner;

public class IsITHalloween {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		if (date.split(" ")[0].compareTo("OCT") == 0 && Integer.parseInt(date.split(" ")[1]) == 31
				|| date.split(" ")[0].compareTo("DEC") == 0 && Integer.parseInt(date.split(" ")[1]) == 25)
			System.out.println("yup");
		else 
			System.out.println("nope");
	}
}
