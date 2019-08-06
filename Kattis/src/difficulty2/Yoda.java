package difficulty2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Yoda {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String firstNum = bi.readLine();
		String secondNum = bi.readLine();
		int res1 = -1, res2 = -1;
		int lengthCommon = Math.min(firstNum.length(), secondNum.length());
		
		for (int i = 0; i < firstNum.length() - lengthCommon; i++) {
			if(res1 == -1 ) res1 = 0;
			res1 *= 10;
			res1 += firstNum.charAt(i) - '0';
		}
		
		for (int i = 0; i < secondNum.length() - lengthCommon; i++) {
			if(res2 == -1 ) res2 = 0;
			res2 *= 10;
			res2 += secondNum.charAt(i) - '0';
		}
		
		for (int i = lengthCommon; i > 0; i--) {
			char c1 = firstNum.charAt(firstNum.length() - i);
			char c2 = secondNum.charAt(secondNum.length() - i);
			if ( c1 >= c2) {
				if (res1 == -1) res1 = 0;
				res1 *= 10;
				res1 += c1 - '0';
			}
			if (c2 >= c1 ) {
				if(res2 == -1 ) res2 = 0;
				res2 *= 10;
				res2 += c2 - '0';
			}
		}
		
		System.out.println(res1 == -1 ? "YODA" : res1);
		System.out.println(res2 == -1 ? "YODA" : res2);
	}
}
