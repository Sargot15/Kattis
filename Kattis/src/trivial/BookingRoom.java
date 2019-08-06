package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BookingRoom {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] data = bi.readLine().split(" ");
		int rooms = Integer.parseInt(data[0]);
		int booked = Integer.parseInt(data[1]);
		List<Integer> bookedRooms = new ArrayList<Integer>();
		if (rooms == booked) System.out.println("too late");
		else {
			for (int i = 0; i < booked; i++) {
				int room = Integer.parseInt(bi.readLine());
				bookedRooms.add(room);
			} 
			for (int i = 1; i <= rooms; i++) {
				if (!bookedRooms.contains(i)) {
					System.out.println(i);
					break;
				}
			}
		}
	}
}
