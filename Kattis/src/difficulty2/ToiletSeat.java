package difficulty2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ToiletSeat {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		char[] people = bi.readLine().toCharArray();
		int policy1 = 0, policy2 = 0, policy3 = 0;
		char last = people[0];
		if (last == 'U') {
			last = people[1];
			if (last == 'U') {
				policy2 = 1;
			} else {
				policy1 = 2;
				policy2 = 1;
				policy3 = 1;
			}
		} else {
			last = people[1];
			if (last == 'U') {
				policy1 = 1;
				policy2 = 2;
				policy3 = 1;
			} else {
				policy1 = 1;
			}
		}
		for (int i = 2; i < people.length; i++) {
			if (people[i] != last) {
				policy3++;
			}
			if (people[i] == 'U') {
				policy2 += 2;
			} else {
				policy1 += 2;
			}
			last = people[i];
		}
		System.out.println(policy1);
		System.out.println(policy2);
		System.out.println(policy3);
	}
}
