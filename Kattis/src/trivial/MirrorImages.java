package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MirrorImages {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(bi.readLine());
		for(int i = 0; i < cases; i++) {
			String[] size = bi.readLine().split(" ");
			int x = Integer.parseInt(size[0]);
			int y = Integer.parseInt(size[1]);
			char[][] grid = new char[x][y];
			for (int j = 0; j < x; j++) {
				grid[j] = bi.readLine().toCharArray();
			}
			System.out.println("Test " + (i + 1));
			for( int j = x- 1; j >= 0; j--) {
				for( int k = y - 1; k >= 0; k--) {
					System.out.print(grid[j][k]);
				}
				System.out.println();
			}
		}
	}
}
