package trivial;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NoDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		String[] words = sentence.split(" ");
		boolean duplicate = false;
		Set<String> duplicates = new HashSet<String>();
		for (int i = 0; i < words.length; i++){
			if ( duplicates.contains(words[i])){
				duplicate = true;
				break;
			}
			duplicates.add(words[i]);
		}
		System.out.println(duplicate ? "no":"yes");
	}
}
