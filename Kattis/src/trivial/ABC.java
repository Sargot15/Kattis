package trivial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ABC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] num = sc.nextLine().split(" ");
		List<Integer> numbers = new ArrayList<Integer>();
		for (String n : num){
			numbers.add(Integer.parseInt(n));
		}
		Collections.sort(numbers);
		
		String letters = sc.nextLine();
		for (int i = 0; i < letters.length(); i++){
			System.out.print(numbers.get(letters.charAt(i) - 'A') + " ");	
		}		
		sc.close();
	}
}
