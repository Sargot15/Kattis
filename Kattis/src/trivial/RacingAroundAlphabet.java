package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RacingAroundAlphabet {
	public static final int DIAMETER = 60;
	public static final int SPEED = 15;
	public static final int PICK = 1;
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int lines = Integer.parseInt(bi.readLine());
		double perimeter = Math.PI * DIAMETER;
		double distBetweenPoints = perimeter / 28;
		for (int i = 0; i < lines; i++){
			String text = bi.readLine();
			if (text.length() > 0){
				int p1 = 0;
				char c = text.charAt(0);
				if (c == ' ') p1 = 'Z' - 'A' + 1; 
				else if (c == '\'') p1 = 'Z' - 'A' + 2; 
				else p1 = c - 'A';
				double distance = PICK;
				for (int j = 1; j < text.length(); j++){
					int p2 = 0;
					c = text.charAt(j);
					if (c == ' ') p2 = 'Z' - 'A' + 1; 
					else if (c == '\'') p2 = 'Z' - 'A' + 2; 
					else p2 = c - 'A';
					double distPoints = Math.min((p1 + 28 - p2) % 28, (p2 + 28 - p1) % 28);
					distance += (distPoints * distBetweenPoints) / SPEED + PICK;
					p1 = p2;
				}
				System.out.println(distance);
			}
			else 
				System.out.println("0");
		}
	}
}
