package difficulty5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * 
 * We are using an approximation as ln n! = Sum(i = 1, to n) ln(i)
 * We calculate ln n! as log10(n!) * LOG_TO_LN const approximation
 * log10(n!) equals to [number of digits] (for example, log10(1000) = 3) + log10(0.[firsts digits])
 * Example, log10(120) = log10(1000) * log10(0.120) --> log10(1000) = 3 (As lenght of the initial number) + log10(0.120)
 * Then we compare what approximation is the closest and this is the result
 */

public class InverseFactorial {
	public static final double LOG_TO_LN = 2.302585093;
    public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String num = bi.readLine();
		int i = 1;
//		BigInteger n = BigInteger.valueOf(1);
//		for (int j = 1; j < 100000; j++) {
//			n = n.multiply(BigInteger.valueOf(j));
//			if (j == 99000)
//			
//			if (j % 1000 == 0)
//				System.out.println(j);
//			num = n.toString();
//		}
	
//		System.out.println("Starting...");
//		long time = System.currentTimeMillis();
		int decimals = Math.min(num.length(), 10);
		double log = Double.parseDouble(num.substring(0, decimals)) / Math.pow(10, decimals);
		double aprox = (num.length() + Math.log10(log)) * LOG_TO_LN;
		double sumLN = 0;
		double diff = Double.MAX_VALUE;
		while (true) {
			sumLN += Math.log(i);
			double d = Math.abs(aprox - sumLN);
			if (d < diff) {
				i++;
				diff = d;
			}
			else
				break;
		}
		
		System.out.println(--i);
//		System.out.println(System.currentTimeMillis() - time + " ms");
    }
}
