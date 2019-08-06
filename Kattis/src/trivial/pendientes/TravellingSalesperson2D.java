package trivial.pendientes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * El problema ha sido solucionado pero con una puntuación baja (no es la misma puntuacion que se suma al ranking, es una especial del problema)
 * Se podría encontrar una solución mejor
 * 
 */
public class TravellingSalesperson2D {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int points = Integer.parseInt(bi.readLine());
		List<Coordinate> coords = new ArrayList<Coordinate>();
		for (int i = 0; i < points; i++) {
			String[] coord = bi.readLine().split(" ");
			coords.add(new Coordinate(Double.parseDouble(coord[0]), Double.parseDouble(coord[0])));
		}
		int[] result = new int[points];
		double distBest = Double.MAX_VALUE;
//		for (int i = 0; i < points; i++) {
			int[] actualSolution = new int[points];
			boolean[] pointsExplored = new boolean[points];
			actualSolution[0] = 0;
			pointsExplored[0] = true;
			double totalDistance = 0;
			int best = 0;
			for (int j = 1; j < points; j++) {
				double minDistance = Double.MAX_VALUE;
				int ini = best;
				for (int k = 0; k < points; k++) {
					if (!pointsExplored[k]){
						double distance = coords.get(best).distanceTo(coords.get(k));
						if (distance < minDistance){
							minDistance = distance;
							best = k;
						}
					}					
				}
				actualSolution[best] = j;
				pointsExplored[best] = true;
				totalDistance += minDistance;
			}
			if (totalDistance < distBest){
				distBest = totalDistance;
				result = actualSolution;
			}
//		}
		for (int i : result){
			System.out.println(i);
		}
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