package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class OddManOut {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(bi.readLine());
		for (int i = 0; i < cases; i++){
			List<String> codes = new ArrayList<String>();
			int persons = Integer.parseInt(bi.readLine());
			String[] invitations = bi.readLine().split(" ");
			for (int j = 0; j < persons; j++){
				if (codes.contains(invitations[j]))
					codes.remove(invitations[j]);
				else
					codes.add(invitations[j]);
			}
			System.out.println("Case #" + (i+1) + ": " + codes.get(0));
		}
	}
}
