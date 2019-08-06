package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Timebomb {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String firstLine = bi.readLine();
		char[][] timeChars = new char[5][firstLine.length()];
		timeChars[0] = firstLine.toCharArray();
		for (int i = 1; i < 5; i++) {
			String line = bi.readLine();
			timeChars[i] = line.toCharArray();
		}
		int numDigits = (firstLine.length() + 1) / 4;
		int time = 0;
		boolean wrongDigit = false;
		for (int i = 0; i < numDigits; i++) {
			int digit = 0;
			// Digit 8
			if (timeChars[0][i * 4] == '*' && timeChars[0][i * 4 + 1] == '*' && timeChars[0][i * 4 + 2] == '*' 
					&& timeChars[1][i * 4] == '*' && timeChars[1][i * 4 + 2] == '*' 
					&& timeChars[2][i * 4] == '*' && timeChars[2][i * 4 + 1] == '*' && timeChars[2][i * 4 + 2] == '*' 
					&& timeChars[3][i * 4] == '*' && timeChars[3][i * 4 + 2] == '*' 
					&& timeChars[4][i * 4] == '*' && timeChars[4][i * 4 + 1] == '*' && timeChars[4][i * 4 + 2] == '*') digit =8;
			else 
			// Digit 9
			if (timeChars[0][i * 4] == '*' && timeChars[0][i * 4 + 1] == '*' && timeChars[0][i * 4 + 2] == '*' 
					&& timeChars[1][i * 4] == '*' && timeChars[1][i * 4 + 2] == '*' 
					&& timeChars[2][i * 4] == '*' && timeChars[2][i * 4 + 1] == '*' && timeChars[2][i * 4 + 2] == '*' 
					&& timeChars[3][i * 4 + 2] == '*' 
					&& timeChars[4][i * 4] == '*' && timeChars[4][i * 4 + 1] == '*' && timeChars[4][i * 4 + 2] == '*') digit =9;
			else 
			// Digit 0
			if (timeChars[0][i * 4] == '*' && timeChars[0][i * 4 + 1] == '*' && timeChars[0][i * 4 + 2] == '*' 
					&& timeChars[1][i * 4] == '*' && timeChars[1][i * 4 + 2] == '*' 
					&& timeChars[2][i * 4] == '*' && timeChars[2][i * 4 + 2] == '*' 
					&& timeChars[3][i * 4] == '*' && timeChars[3][i * 4 + 2] == '*' 
					&& timeChars[4][i * 4] == '*' && timeChars[4][i * 4 + 1] == '*' && timeChars[4][i * 4 + 2] == '*') digit =0;
			else
			// Digit 2
			if (timeChars[0][i * 4] == '*' && timeChars[0][i * 4 + 1] == '*' && timeChars[0][i * 4 + 2] == '*' 
					&& timeChars[1][i * 4 + 2] == '*' 
					&& timeChars[2][i * 4] == '*' && timeChars[2][i * 4 + 1] == '*' && timeChars[2][i * 4 + 2] == '*' 
					&& timeChars[3][i * 4] == '*' 
					&& timeChars[4][i * 4] == '*' && timeChars[4][i * 4 + 1] == '*' && timeChars[4][i * 4 + 2] == '*') digit =2;
			else 
			// Digit 3
			if (timeChars[0][i * 4] == '*' && timeChars[0][i * 4 + 1] == '*' && timeChars[0][i * 4 + 2] == '*' 
					&& timeChars[1][i * 4 + 2] == '*' 
					&& timeChars[2][i * 4] == '*' && timeChars[2][i * 4 + 1] == '*' && timeChars[2][i * 4 + 2] == '*' 
					&& timeChars[3][i * 4 + 2] == '*' 
					&& timeChars[4][i * 4] == '*' && timeChars[4][i * 4 + 1] == '*' && timeChars[4][i * 4 + 2] == '*') digit =3;
			else 
			// Digit 4
			if (timeChars[0][i * 4] == '*' && timeChars[0][i * 4 + 2] == '*' 
					&& timeChars[1][i * 4] == '*' && timeChars[1][i * 4 + 2] == '*' 
					&& timeChars[2][i * 4] == '*' && timeChars[2][i * 4 + 1] == '*' && timeChars[2][i * 4 + 2] == '*' 
					&& timeChars[3][i * 4 + 2] == '*' 
					&& timeChars[4][i * 4 + 2] == '*') digit =4;
			else
			// Digit 6
			if (timeChars[0][i * 4] == '*' && timeChars[0][i * 4 + 1] == '*' && timeChars[0][i * 4 + 2] == '*' 
					&& timeChars[1][i * 4] == '*' 
					&& timeChars[2][i * 4] == '*' && timeChars[2][i * 4 + 1] == '*' && timeChars[2][i * 4 + 2] == '*' 
					&& timeChars[3][i * 4] == '*' && timeChars[3][i * 4 + 2] == '*' 
					&& timeChars[4][i * 4] == '*' && timeChars[4][i * 4 + 1] == '*' && timeChars[4][i * 4 + 2] == '*') digit =6;
			else 
			// Digit 5
			if (timeChars[0][i * 4] == '*' && timeChars[0][i * 4 + 1] == '*' && timeChars[0][i * 4 + 2] == '*' 
					&& timeChars[1][i * 4] == '*' 
					&& timeChars[2][i * 4] == '*' && timeChars[2][i * 4 + 1] == '*' && timeChars[2][i * 4 + 2] == '*' 
					&& timeChars[3][i * 4 + 2] == '*' 
					&& timeChars[4][i * 4] == '*' && timeChars[4][i * 4 + 1] == '*' && timeChars[4][i * 4 + 2] == '*') digit =5;
			else
			// Digit 7
			if (timeChars[0][i * 4] == '*' && timeChars[0][i * 4 + 1] == '*' && timeChars[0][i * 4 + 2] == '*' 
					&& timeChars[1][i * 4 + 2] == '*' 
					&& timeChars[2][i * 4 + 2] == '*' 
					&& timeChars[3][i * 4 + 2] == '*' 
					&& timeChars[4][i * 4 + 2] == '*') digit =7;
			else			
			// Digit 1
			if (timeChars[0][i * 4 + 2] == '*' 
					&& timeChars[1][i * 4 + 2] == '*' 
					&& timeChars[2][i * 4 + 2] == '*' 
					&& timeChars[3][i * 4 + 2] == '*' 
					&& timeChars[4][i * 4 + 2] == '*') digit =1;
			else {
				wrongDigit = true;
				break;
			}
			time = time * 10 + digit;
		}
		System.out.println(!wrongDigit && time % 6 == 0 ? "BEER!!" : "BOOM!!");
	}
}
