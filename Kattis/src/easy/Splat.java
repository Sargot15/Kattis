package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Splat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String lines = sc.nextLine();
		for (int i = 0; i < Integer.parseInt(lines); i++){
			String numPoints = sc.nextLine();
			List<Point> points = new ArrayList<Point>();
			for (int j = 0; j < Integer.parseInt(numPoints); j++){
				String[] line = sc.nextLine().split(" ");
				points.add(new Point(Double.parseDouble(line[0]), Double.parseDouble(line[1]),Double.parseDouble(line[2]), line[3]));
			}
			String numQueries = sc.nextLine();
			for (int j = 0; j < Integer.parseInt(numQueries); j++){
				double coordX = sc.nextDouble();
				double coordY = sc.nextDouble();
				sc.nextLine();
				String color = "white";
				for (int k = points.size() - 1; k >= 0; k--){
					Point p = points.get(k);
					double rad = Math.sqrt(p.vol / Math.PI);
					if (Math.sqrt(Math.pow(p.x - coordX, 2) + Math.pow(p.y - coordY, 2)) <= rad){
						color = p.color;
						break;
					}
				}
				System.out.println(color);
			}
		}	
		sc.close();
	}
}

class Point{
	double x;
	double y;
	double vol;
	String color;
	
	public Point(double x, double y, double vol, String color) {
		this.x = x;
		this.y = y;
		this.vol = vol;
		this.color = color;
	}
	
	
}