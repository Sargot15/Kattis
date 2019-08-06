package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShatteredCake {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int w = Integer.parseInt(bi.readLine());
		int pieces = Integer.parseInt(bi.readLine());
		int totalArea = 0;
		for (int i = 0; i < pieces; i++) {
			String[] piece = bi.readLine().split(" ");
			int pieceW = Integer.parseInt(piece[0]);
			int pieceL = Integer.parseInt(piece[1]);
			
			totalArea += pieceW * pieceL;
			
		}
		System.out.println(totalArea / w);
	}
}
