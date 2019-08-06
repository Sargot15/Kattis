package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DifferentDistance {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		while (true){
			String data = bi.readLine();
			if ("0".equals(data)) break;
			String[] dataSplitted = data.split(" ");
			double x1 = Double.parseDouble(dataSplitted[0]);
			double y1 = Double.parseDouble(dataSplitted[1]);
			double x2 = Double.parseDouble(dataSplitted[2]);
			double y2 = Double.parseDouble(dataSplitted[3]);
			double p = Double.parseDouble(dataSplitted[4]);
			
			System.out.println(Math.pow(Math.pow(Math.abs(x1 - x2), p) + Math.pow(Math.abs(y1 - y2), p), 1/p));
			
		}
	}
}
