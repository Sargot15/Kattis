package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EraseSecurely {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int iterations = Integer.parseInt(bi.readLine());
		String original = bi.readLine();
		String secured = bi.readLine();
		if (iterations % 2 == 0)
			if (original.equals(secured))
				System.out.println("Deletion succeeded");
			else
				System.out.println("Deletion failed");
		else {
			boolean secure = true;
			for(int i = 0; i < original.length(); i++) {
				if (original.charAt(i) == secured.charAt(i)) {
					secure = false;
					break;
				}
			}
			if ( secure)
				System.out.println("Deletion succeeded");
			else
				System.out.println("Deletion failed");
		}
	}
}
