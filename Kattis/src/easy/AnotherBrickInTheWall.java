package easy;

import java.util.Scanner;

public class AnotherBrickInTheWall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		sc.nextLine();
		int actualH = 0;
		int actualW = 0;
		boolean can = false;
		for (int i = 0; i < n; i++){
			int length = sc.nextInt();
			if (actualW + length > w)
				break;
			else
				if (actualW + length == w){
					actualH++;
					if (actualH == h){
						can = true;
						break;
					}
					actualW = 0;
				} else
					actualW += length;
		}
		System.out.println(can ? "YES": "NO");
		sc.close();
	}
}
