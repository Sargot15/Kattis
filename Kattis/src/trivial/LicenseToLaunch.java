package trivial;

import java.util.Scanner;

public class LicenseToLaunch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numDays = sc.nextLine();
		int result = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < Integer.parseInt(numDays); i++){
			int junk = sc.nextInt();
			if ( junk < min){
				min = junk;
				result = i;
			}
		}
		System.out.println(result);
	}
}
