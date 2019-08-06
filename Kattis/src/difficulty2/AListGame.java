package difficulty2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AListGame {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bi.readLine());
		int count = 0;
		while (num != 1){
			int div = num;
			if (num % 2 == 0) {
				div = 2;
			} else {
				for (int i = 3; i <= num / 2; i += 2) {
					if (num % i == 0){
						div = i;
						break;
					}
				}				
			}
			num /= div;
			count++;
		}
		
		System.out.println(count);
	}
}
