package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaisFormula {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int lines = Integer.parseInt(bi.readLine());
		double totalArea = 0;
		String[] firstLine = bi.readLine().split(" ");
		int lastTime = Integer.parseInt(firstLine[0]);
		double lastGlucose = Double.parseDouble(firstLine[1]);
		for (int i = 1; i < lines; i++) {
			String[] line = bi.readLine().split(" ");
			int time = Integer.parseInt(line[0]);
			double glucose = Double.parseDouble(line[1]);
			
			totalArea += (lastGlucose + glucose) / 2 * (time - lastTime) / 1000;
			
			lastTime = time;
			lastGlucose = glucose;
		}
		System.out.println(totalArea);
	}
}
