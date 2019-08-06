package difficulty2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AboveAverage {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(bi.readLine());
		for (int i = 0; i < cases; i++) {
			String[] data = bi.readLine().split(" ");
			int nums = Integer.parseInt(data[0]);
			double average = 0;
			for (int j = 1; j < data.length; j++) {
				average += Integer.parseInt(data[j]);
			}
			average = average / nums;
			double above = 0;
			for (int j = 1; j < data.length; j++) {
				if (Integer.parseInt(data[j]) > average)
					above++;
			}
			
			System.out.printf("%.3f", above * 100 / nums);
			System.out.println("%");
		}
	}
}
