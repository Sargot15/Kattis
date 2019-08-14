package difficulty2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrainPassengers {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] data = bi.readLine().split(" ");
		int maxCapacity = Integer.parseInt(data[0]), capacity = 0;
		int stations = Integer.parseInt(data[1]);
		boolean possible = true;
		
		for (int i = 1; i <= stations ; i++) {
			data = bi.readLine().split(" ");
			int down = Integer.parseInt(data[0]);
			capacity -= down;
			if (capacity < 0) {
				possible = false;
				break;
			}
			int up = Integer.parseInt(data[1]);
			capacity += up;
			if (capacity > maxCapacity) {
				possible = false;
				break;
			}
			int waiting = Integer.parseInt(data[2]);
			if (waiting > 0)
				if (i == stations || capacity < maxCapacity) {
					possible = false;
					break;
				}
		}
		
		System.out.println(possible && capacity == 0 ? "possible" : "impossible");
	}
}
