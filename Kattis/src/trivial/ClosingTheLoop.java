package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClosingTheLoop {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(bi.readLine());
		for (int i = 0; i < cases; i++) {
			int numSegments = Integer.parseInt(bi.readLine());
			List<Integer> redSegments = new ArrayList<Integer>();
			List<Integer> blueSegments = new ArrayList<Integer>();
			int total = 0;
			String[] segments = bi.readLine().split(" ");
			for (int j = 0; j < numSegments; j++) {
				if (segments[j].charAt(segments[j].length() - 1) == 'R')
					redSegments.add(Integer.parseInt(segments[j].substring(0, segments[j].length() - 1)));
				else
					blueSegments.add(Integer.parseInt(segments[j].substring(0, segments[j].length() - 1)));
			}
			Collections.sort(redSegments);
			Collections.sort(blueSegments);
			
			for (int j = 0; j < Math.min(redSegments.size(), blueSegments.size()); j++) {
				total += redSegments.get(redSegments.size() - 1 - j);
				total += blueSegments.get(blueSegments.size() - 1 - j);
				total -= 2;
			}
			System.out.println("Case #" + (i+1) + ": " + total);
		}
	}
}
