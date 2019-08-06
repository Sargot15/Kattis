package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CoconutSplat {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] data = bi.readLine().split(" ");
		int syllabes = Integer.parseInt(data[0]);
		int players = Integer.parseInt(data[1]);
		// "IDs" of hands still playing
		List<Integer> handsLeft = new ArrayList<Integer>();
		int[] hands = new int[players * 2];
		for (int i = 0; i < players * 2; i++) {
			hands[i] = 3;
			if (i % 2 == 0)
				handsLeft.add(i);
		}
		int winner = -1;
		int index = 0;
		while (winner == -1){
			index = (index + syllabes - 1) % handsLeft.size();
			int hand = handsLeft.get(index);
			hands[hand]--;
			switch (hands[hand]){
				case 0:
					handsLeft.remove(index);
					if (handsLeft.size() == 1 || (handsLeft.size() == 2 && handsLeft.get(0) / 2 == handsLeft.get(1) / 2))
						winner = handsLeft.get(0) / 2 + 1;
					break;
				case 1:
					index++;
					break;
				case 2:
					if (index + 1 == handsLeft.size()) handsLeft.add(hand + 1);
					else handsLeft.add(index + 1, hand + 1);
					hands[hand + 1]--;
					break;
			}
		}
		
		System.out.println(winner);
	}
}
