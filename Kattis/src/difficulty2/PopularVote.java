package difficulty2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PopularVote {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(bi.readLine());
		for (int i =0; i < cases; i++) {
			int parties = Integer.parseInt(bi.readLine());
			int winner = 0;
			int maxVotes = 0;
			int totalVotes = 0;
			for (int j = 1; j <= parties; j++) {
				int votes = Integer.parseInt(bi.readLine());
				if(votes == maxVotes) winner = -1;
				else if (votes > maxVotes) {
					maxVotes = votes;
					winner = j;
				}
				totalVotes += votes;
			}
			if (winner == -1)
				System.out.println("no winner");
			else {
				if( (double)maxVotes / totalVotes > 0.5)
					System.out.print("majority");
				else
					System.out.print("minority");
				System.out.println(" winner " + winner);
			}
		}
	}
}
