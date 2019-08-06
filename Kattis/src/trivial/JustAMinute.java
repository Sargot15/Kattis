package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JustAMinute {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(bi.readLine());
		int totalS = 0, totalM = 0;
		for (int i = 0; i < cases; i++) {
			String[] line = bi.readLine().split(" ");
			totalM += Integer.parseInt(line[0]);
			totalS +=Integer.parseInt(line[1]);
		
		}		
		double realM = (double)totalS / 60 / totalM;
		System.out.println(realM > 1 ? realM : "measurement error");
	}
}
