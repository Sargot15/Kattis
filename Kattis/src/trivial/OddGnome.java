package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddGnome {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int groups = Integer.parseInt(bi.readLine());
		for (int i = 0; i < groups; i++) {
			String[] ids = bi.readLine().split(" ");
			int numGnomes = Integer.parseInt(ids[0]);
			int lastId = -1;
			for (int j = 0; j < numGnomes; j++) {
				int id = Integer.parseInt(ids[j + 1]);
				if (id == lastId + 1 || lastId == -1)
					lastId = id;
				else{
					System.out.println(j + 1);
					break;
				}
			}
		}
	}
}
