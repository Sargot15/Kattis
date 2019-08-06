package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class UnbearableZoo {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int list = 0;
		while (true){
			list++;
			int animals = Integer.parseInt(bi.readLine());
			if (animals == 0) break;
			Map<String,Integer> animalsSeen = new TreeMap<String, Integer>();
			for (int i = 0; i < animals; i++) {
				String[] animalFull = bi.readLine().split(" ");
				String animal = animalFull[animalFull.length - 1].toLowerCase();
				int seen = 1;
				if (animalsSeen.containsKey(animal))
					seen = animalsSeen.get(animal) + 1;
				animalsSeen.put(animal, seen);
			}
			System.out.println("List " + list + ":");
			for (String a : animalsSeen.keySet()){
				System.out.println(a + " | " + animalsSeen.get(a));
			}
		}
	}
}
