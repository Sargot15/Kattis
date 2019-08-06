package difficulty2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BusNumbers {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int numbers = Integer.parseInt(bi.readLine());
		String[] buses = bi.readLine().split(" ");
		List<Integer> sortedBuses = new ArrayList<Integer>();
		for (int i = 0; i < numbers; i++) {
			sortedBuses.add(Integer.parseInt(buses[i]));
		}
		Collections.sort(sortedBuses);
		int lastNumber = sortedBuses.get(0);
		int numConnected = 0;
		System.out.print(lastNumber);
		for (int i = 1; i < sortedBuses.size(); i++) {
			int num = sortedBuses.get(i);
			if (num == lastNumber + 1) {
				numConnected++;
			} else {
				if (numConnected > 1) {
					System.out.print("-" + lastNumber);
				} else if (numConnected == 1) {
					System.out.print(" " + lastNumber);
				}
				System.out.print(" " + num);
				numConnected = 0;
			}
			lastNumber = num;
		}
		if (numConnected > 1) {
			System.out.print("-" + lastNumber);
		} else if (numConnected == 1) {
			System.out.print(" " + lastNumber);
		}
	}
}
