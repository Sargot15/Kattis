package difficulty2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlackFriday {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		bi.readLine();
		String[] dices = bi.readLine().split(" ");
		int[] rolled = new int[6];
		int[] position = new int[6];
		for (int i = 0; i < dices.length; i++) {
			int dice = Integer.parseInt(dices[i]);
			rolled[dice - 1]++;
			position[dice - 1] = i + 1;
		}
		int result = -1;
		for (int i = 5; i >= 0; i--) {
			if(rolled[i] == 1) {
				result = i;
				break;
			}
		}
		System.out.println(result == -1 ? "none" : position[result]);
	}
}
