package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parking {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] data = bi.readLine().split(" ");
		int[] costs = {Integer.parseInt(data[0]),Integer.parseInt(data[1]),Integer.parseInt(data[2])};
		List<TimeParking> timeParking = new ArrayList<TimeParking>();
		for (int i = 0; i < 3; i++) {
			String[] truck = bi.readLine().split(" ");
			timeParking.add(new TimeParking(Integer.parseInt(truck[0]), false));
			timeParking.add(new TimeParking(Integer.parseInt(truck[1]), true));
		}
		Collections.sort(timeParking);
		TimeParking prev = timeParking.get(0);
		int totalCost = 0;
		int countTrucks = 1;
		for (int i = 1; i < timeParking.size(); i++) {
			TimeParking actual = timeParking.get(i);
			if (countTrucks > 0)
				totalCost += (actual.minute - prev.minute) * costs[countTrucks - 1] * countTrucks;
			if (actual.exit) countTrucks--;
			else countTrucks++;
			prev = actual;
		}
		System.out.println(totalCost);
	}
}

class TimeParking implements Comparable<TimeParking>{
	int minute;
	boolean exit;
	
	public TimeParking(int minute, boolean exit){
		this.minute = minute;
		this.exit = exit;
	}
	@Override
	public int compareTo(TimeParking o) {
		return this.minute - o.minute;
	}
}
