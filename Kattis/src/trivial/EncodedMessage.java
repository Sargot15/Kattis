package trivial;

import java.util.Scanner;

public class EncodedMessage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String lines = sc.nextLine();
		for (int i = 0; i < Integer.parseInt(lines); i++){
			String message = sc.nextLine();
			int sqrt = (int)Math.sqrt(message.length());
			char[] encripted = new char[message.length()];
			for (int j = 0; j < sqrt; j++){
				for (int k = 0; k < sqrt; k++){
					encripted[j * sqrt + k] = message.charAt(k * sqrt + (sqrt - 1 - j));
				}
			}
			System.out.println(new String(encripted));
		}	
	}
}
