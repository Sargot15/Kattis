package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prozor {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] data = bi.readLine().split(" ");
		int rows = Integer.parseInt(data[0]);
		int cols = Integer.parseInt(data[1]);
		int length = Integer.parseInt(data[2]);
		char[][] window = new char[rows][cols];
		for (int i = 0; i < rows; i++) {
			window[i] = bi.readLine().toCharArray();
		}
		int racket = length - 2;
		int maxFlies = -1;
		int posI = -1, posJ = -1;
		for (int i = 1; i < rows - racket; i++) {
			for (int j = 1; j < cols - racket; j++) {
				int flies = 0;
				for (int i1 = 0; i1 < racket; i1++) {
					for (int j1 = 0; j1 < racket; j1++) {
						if (window[i+i1][j+j1] == '*') flies++;
					}
				}
				if (flies > maxFlies){
					maxFlies = flies;
					posI = i;
					posJ = j;
							
				}
			}
		}
		System.out.println(maxFlies);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols ; j++) {
				if (i == posI - 1 || i == posI + racket)
					if (j == posJ - 1 || j == posJ + racket)
						System.out.print("+");
					else if (j >= posJ - 1 && j <= posJ + racket)
						System.out.print("-");
					else
						System.out.print(window[i][j]);
				else if (j == posJ - 1 || j == posJ + racket)
					if (i >= posI - 1 && i <= posI + racket)
						System.out.print("|");
					else
						System.out.print(window[i][j]);
				else 
					System.out.print(window[i][j]);
			}
			System.out.println();
		}
	}
}
