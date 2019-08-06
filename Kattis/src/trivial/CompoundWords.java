package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CompoundWords {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String data;
		List<String> words = new ArrayList<String>();
		while ( (data = bi.readLine()) != null){
			String [] word = data.split(" ");
			words.addAll(new ArrayList<String>(Arrays.asList(word)));
		}
		
		Set<String> compWords = new HashSet<String>();
		for (int i = 0; i < words.size(); i++) {
			for (int j = 0; j < words.size(); j++) {
				if (i != j) compWords.add(words.get(i) + words.get(j));
			}
		}
		
		List<String> finalList = new ArrayList<String>();
		for (String s : compWords)
			finalList.add(s);
		Collections.sort(finalList);
		
		for (String s : finalList)
			System.out.println(s);
	}
}
