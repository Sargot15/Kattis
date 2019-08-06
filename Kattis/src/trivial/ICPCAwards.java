package trivial;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ICPCAwards {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String teams = sc.nextLine();
		Set<String> winners = new HashSet<String>();
		for (int i = 0; i < Integer.parseInt(teams); i++){
			String team = sc.nextLine();
			String univerisy = team.split(" ")[0];
			if (!winners.contains(univerisy)){
				winners.add(univerisy);
				System.out.println(team);
			}
			if (winners.size() > 11)
				break;
		}
	}
}
