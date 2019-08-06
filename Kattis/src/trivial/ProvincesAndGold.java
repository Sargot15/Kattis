package trivial;

import java.util.Scanner;

public class ProvincesAndGold {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gold = sc.nextInt();
		int silver = sc.nextInt();
		int copper = sc.nextInt();
		
		int total = gold * 3 + silver * 2 + copper * 1;
		
		if ( total >= 8) System.out.print("Province or ");
		else if (total >=5 ) System.out.print("Duchy or ");
		else if (total >=2 ) System.out.print("Estate or ");
		
		if ( total >= 6) System.out.print("Gold");
		else if (total >=3 ) System.out.print("Silver");
		else System.out.print("Copper");
	}
}
