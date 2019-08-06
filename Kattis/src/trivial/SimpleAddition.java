package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class SimpleAddition {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		BigInteger firstNum = new BigInteger(bi.readLine());
		BigInteger secondNum = new BigInteger(bi.readLine());
		
		System.out.println(firstNum.add(secondNum));
	}
}
