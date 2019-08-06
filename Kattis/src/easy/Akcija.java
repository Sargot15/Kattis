package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Akcija {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numBooks = sc.nextLine();
		List<Integer> prices = new ArrayList<Integer>();
		for ( int i = 0; i < Integer.parseInt(numBooks); i++){
			int price = sc.nextInt();
			prices.add(price);
		}
		Collections.sort(prices);
		int sum = 0;
		for ( int i = prices.size() - 1 ; i >= 0; i--){
			if (i % 3 != prices.size() % 3) sum += prices.get(i);
		}
		
		System.out.println(sum);
		sc.close();
	}
}
