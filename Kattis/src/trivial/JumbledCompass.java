package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JumbledCompass {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int firstNum = Integer.parseInt(bi.readLine());
		int secondNum = Integer.parseInt(bi.readLine());
		
		int clockWise = (secondNum + 360 - firstNum) % 360;
		int counterClockWise = (firstNum + 360 - secondNum) % 360;
		
		System.out.println(clockWise <= counterClockWise ? clockWise : counterClockWise * -1);
	}
}
