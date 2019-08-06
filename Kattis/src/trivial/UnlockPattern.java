package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class UnlockPattern {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, Coordinate> patron = new HashMap<Integer, Coordinate>();
		for (int i = 0; i < 3; i++) {
			String[] numbers = bi.readLine().split(" ");
			patron.put(Integer.parseInt(numbers[0]), new Coordinate(0, i));
			patron.put(Integer.parseInt(numbers[1]), new Coordinate(1, i));
			patron.put(Integer.parseInt(numbers[2]), new Coordinate(2, i));
		}
		
		double totalDist = 0;
		Coordinate before = patron.get(1);
		for (int i = 2; i <= 9; i++) {
			Coordinate actual = patron.get(i);
			totalDist += before.distanceTo(actual);
			before = actual;
		}
		System.out.println(totalDist);
	}
}

class Coordinate{
	double x;
	double y;
	public Coordinate(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double distanceTo(Coordinate c){
		return Math.sqrt(Math.pow(this.x - c.x, 2) + Math.pow(this.y - c.y, 2));
	}
}
