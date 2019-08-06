package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HydraHeads {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String hydra;
		while ( (hydra = bi.readLine()) != null){
			int h = Integer.parseInt(hydra.split(" ")[0]);
			int t = Integer.parseInt(hydra.split(" ")[1]);
			if ( h == 0 && t == 0) break;
			int moves = 0;
			while (h > 0 || t > 0){
				if (h % 2 == 1 && t == 0){
					moves = -1;
					break;
				} else if (t == 2 && h % 2 == 0){
					t += 1;
				} else if (t > 1 && h > 0 || t > 3){
					t -= 2;
					h +=1;
				} else if (h > 1){
					h -= 2;
				} else if (t > 0){
					t += 1;
				} else {
					moves = -1;
					break;			
				}
				moves++;
			}
			System.out.println(moves);
		}
	}
}
