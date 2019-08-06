package trivial;

import java.util.Scanner;

public class StandOfZanzibar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tests = sc.nextLine();
		for (int i = 0; i < Integer.parseInt(tests); i++){
			int actualNumber;
			int lastNumber = -1;
			int sum = 0;
			while (sc.hasNext() && (actualNumber = sc.nextInt()) != 0){
				if (lastNumber != -1){
					sum += Math.max(0, actualNumber - lastNumber * 2);
				}
				lastNumber = actualNumber;
			}
			sc.nextLine();
			System.out.println(sum);
		}
		sc.close();
	}
}
