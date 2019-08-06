package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecretMessage {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(bi.readLine());
		for (int i = 0; i < cases; i++) {
			char[] message = bi.readLine().toCharArray();
			int len = (int)Math.ceil(Math.sqrt(message.length));
			for (int j = 0; j < len; j++) {
				for (int k = 0; k < len; k++) {
					int index = (len - k - 1) * len + j;
					if (index < message.length)
						System.out.print(message[index]);
				}
			}
			System.out.println();
		}
	}
}
