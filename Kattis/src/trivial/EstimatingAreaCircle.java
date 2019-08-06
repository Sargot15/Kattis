package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EstimatingAreaCircle {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		while (true){
			String[] data = bi.readLine().split(" ");
			double r = Double.parseDouble(data[0]);
			double m = Double.parseDouble(data[1]);
			double c = Double.parseDouble(data[2]);
			if (r == 0 && m == 0 && c == 0) break;
			
			double real = Math.pow(r, 2) * Math.PI;
			double estimated = c / m * Math.pow(r * 2, 2);
			
			System.out.println(real + " " + estimated);
		}
	}
}
