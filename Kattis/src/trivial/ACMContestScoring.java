package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ACMContestScoring {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		Set<String> resolved = new HashSet<String>();
		Map<String,Integer> points = new HashMap<String, Integer>();
		while (true){
			String[] dataLog = bi.readLine().split(" ");
			if (dataLog.length == 1) break;
			
			int time = Integer.parseInt(dataLog[0]);
			String problem = dataLog[1];
			boolean right = dataLog[2].equals("right");
			
			if (!resolved.contains(problem)){
				if (right){
					resolved.add(problem);
				}
				int prevPoints = 0;
				int actualPoints = right ? time : 20;
				if (points.containsKey(problem)) prevPoints = points.get(problem);
				points.put(problem, prevPoints + actualPoints);
			}
		}
		int totalPenalty = 0;
		for (String p : resolved) {
			totalPenalty += points.get(p);
		} 
		System.out.println(resolved.size() + " " + totalPenalty);
	}
}
