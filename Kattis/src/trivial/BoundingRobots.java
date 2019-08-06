package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BoundingRobots {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String[] dataRoom = bi.readLine().split(" ");
			int w = Integer.parseInt(dataRoom[0]);
			int l = Integer.parseInt(dataRoom[1]);
			if ( w == 0 && l == 0) break;
			int moves = Integer.parseInt(bi.readLine());
			int xT = 0, xR = 0, yT = 0, yR = 0;
			for (int i = 0; i < moves; i++) {
				String[] move = bi.readLine().split(" ");
				int cells = Integer.parseInt(move[1]);
				switch (move[0]){
					case "u":
						yT += cells;
						yR = Math.min(yR + cells, l - 1);
						break;
					case "d":
						yT -= cells;
						yR = Math.max(yR - cells, 0);
						break;
					case "r":
						xT += cells;
						xR = Math.min(xR + cells, w - 1);
						break;
					case "l":
						xT -= cells;
						xR = Math.max(xR - cells, 0);
						break;
				}
			}
			System.out.println("Robot thinks " + xT + " " + yT);
			System.out.println("Actually at " + xR + " " + yR);
			System.out.println();
		}
	}
}
