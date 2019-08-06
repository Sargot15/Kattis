package trivial;

import java.util.Scanner;

public class HangingOutTerrace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxCapacity = sc.nextInt();
		int events = sc.nextInt();
		sc.nextLine();
		int rejected = 0;
		int actualCapacity = 0;
		for (int i = 0; i < events; i++){
			String[] event = sc.nextLine().split(" ");
			int group = Integer.parseInt(event[1]);
			if (event[0].equals("leave")) actualCapacity -= group;
			if (event[0].equals("enter")){
				if (actualCapacity + group > maxCapacity)
					rejected++;
				else
					actualCapacity += group;
			}
		}

		System.out.println(rejected);
		sc.close();
	}
}
