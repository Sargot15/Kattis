package trivial;

import java.util.Scanner;

public class Volim {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int actualPlayer = Integer.parseInt(sc.nextLine());
		int questions = Integer.parseInt(sc.nextLine());
		int timeToExplode = 210; // 3 minutes and a half
		for (int i = 0; i < questions; i++){
			String[] event = sc.nextLine().split(" ");
			int time = Integer.parseInt(event[0]);
			timeToExplode -= time;
			if (timeToExplode <= 0)
				break;

			if (event[1].equals("T")){
				actualPlayer++;
				if (actualPlayer > 8) actualPlayer -= 8;
			}
			
		}

		System.out.println(actualPlayer);
		sc.close();
	}
}
