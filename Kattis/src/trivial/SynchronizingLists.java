package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SynchronizingLists {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		while (true){
			int cases = Integer.parseInt(bi.readLine());
			if (cases == 0) break;
			Map<Integer,Integer> numPos = new HashMap<Integer,Integer>();
			List<Integer> firstList = new ArrayList<Integer>();
			List<Integer> firstListSorted = new ArrayList<Integer>();
			List<Integer> secondList = new ArrayList<Integer>();
			for (int i = 0; i < cases; i++) {
				int num = Integer.parseInt(bi.readLine());
				firstList.add(num);
				firstListSorted.add(num);
			}
			Collections.sort(firstListSorted);
			for (int i = 0; i < cases; i++) {
				secondList.add(Integer.parseInt(bi.readLine()));
				numPos.put(firstListSorted.get(i), i);
			}
			Collections.sort(secondList);
			for (int n: firstList) {
				System.out.println(secondList.get(numPos.get(n)));
			}
			System.out.println();
		}
	}
}
