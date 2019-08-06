package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cudoviste {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] size = bi.readLine().split(" ");
		int rows = Integer.parseInt(size[0]);
		int cols = Integer.parseInt(size[1]);
		int[] squashes = {0,0,0,0,0};
		char[][] parking = new char[rows][cols];
		for (int i = 0; i < rows; i++) {
			parking[i] = bi.readLine().toCharArray();
		}
		for (int i = 1; i < rows; i++) {
			for (int j = 1; j < cols; j++) {
				int numCars = 0;
				char c = parking[i][j];
				if (c == '#') continue;
				if (c == 'X') numCars++;
				c = parking[i][j-1];
				if (c == '#') continue;
				if (c == 'X') numCars++;
				c = parking[i-1][j];
				if (c == '#') continue;
				if (c == 'X') numCars++;
				c = parking[i-1][j-1];
				if (c == '#') continue;
				if (c == 'X') numCars++;
				squashes[numCars]++;
			}
		}
		for (int i: squashes) {
			System.out.println(i);			
		}
	}
}

