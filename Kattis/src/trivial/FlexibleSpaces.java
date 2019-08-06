package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlexibleSpaces {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] data = bi.readLine().split(" ");
		int w = Integer.parseInt(data[0]);
		String[] wallsStr = bi.readLine().split(" ");
//		Set<Integer> possibles = new TreeSet<Integer>();
		int[] possibles = new int[w + 1];
		int[] walls = new int[wallsStr.length];
		for (int i = 0; i < wallsStr.length; i++) {
			int wall = Integer.parseInt(wallsStr[i]);
			possibles[wall]++;
			possibles[w - wall]++;
			for (int j = 0; j < i; j++) {
				possibles[wall - walls[j]]++;
			}
			walls[i] = wall;
		}
		possibles[w]++;
		for(int i = 1; i < possibles.length; i++) {
			System.out.print(possibles[i] == 0 ? "" : i + " ");
		}
	}
}
