package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlantingTrees {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int trees = Integer.parseInt(bi.readLine());
		String[] daysTrees = bi.readLine().split(" ");
		List<Integer> days = new ArrayList<Integer>();
		for (int i = 0; i < trees; i++) {
			days.add(Integer.parseInt(daysTrees[i]));
		}
		Collections.sort(days);
		int max = -1;
		for (int i = 0; i < trees; i++) {
			int day = 2 + days.get(days.size() - i - 1) + i;
			if (day > max) max = day;
		}
		
		System.out.println(max);
	}
}
