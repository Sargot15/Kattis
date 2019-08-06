package difficulty3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class CD {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = bi.readLine()) != null) {
			String[] cds = line.split(" ");
			int cdsJack = Integer.parseInt(cds[0]);
			int cdsJill = Integer.parseInt(cds[1]);
			if (cdsJack ==0 && cdsJill == 0) break;
			Set<Integer> listCds = new HashSet<Integer>();
			for (int i = 0; i < cdsJack; i++) {
				listCds.add(Integer.parseInt(bi.readLine()));
			}
			int count = 0;
			for (int i = 0; i < cdsJill; i++) {
				if (listCds.contains(Integer.parseInt(bi.readLine())))
					count++;
			}
			System.out.println(count);
		}
	}
}
