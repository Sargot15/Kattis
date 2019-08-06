package trivial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SymmetricOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int set = 0;
		int numSet = 0;
		while ((set = Integer.parseInt(sc.nextLine())) > 0){
			numSet++;
			System.out.println("SET " + numSet);
			List<String> words = new ArrayList<String>();
			for(int i = 0; i < set; i++){
				if (i % 2 == 0) System.out.println(sc.nextLine()); 
				else words.add(sc.nextLine());
			}
			for (int i = words.size() - 1; i >= 0; i--){
				System.out.println(words.get(i));
			}
		}	
	}
}
