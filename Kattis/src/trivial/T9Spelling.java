package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class T9Spelling {
    public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(bi.readLine());
		Map<Character, KeyT9> dictionary = new HashMap<Character, KeyT9>();
		dictionary.put('a', new KeyT9(2,1)); dictionary.put('b', new KeyT9(2,2)); dictionary.put('c', new KeyT9(2,3));
		dictionary.put('d', new KeyT9(3,1)); dictionary.put('e', new KeyT9(3,2)); dictionary.put('f', new KeyT9(3,3));
		dictionary.put('g', new KeyT9(4,1)); dictionary.put('h', new KeyT9(4,2)); dictionary.put('i', new KeyT9(4,3));
		dictionary.put('j', new KeyT9(5,1)); dictionary.put('k', new KeyT9(5,2)); dictionary.put('l', new KeyT9(5,3));
		dictionary.put('m', new KeyT9(6,1)); dictionary.put('n', new KeyT9(6,2)); dictionary.put('o', new KeyT9(6,3));
		dictionary.put('p', new KeyT9(7,1)); dictionary.put('q', new KeyT9(7,2)); dictionary.put('r', new KeyT9(7,3)); dictionary.put('s', new KeyT9(7,4));
		dictionary.put('t', new KeyT9(8,1)); dictionary.put('u', new KeyT9(8,2)); dictionary.put('v', new KeyT9(8,3));
		dictionary.put('w', new KeyT9(9,1)); dictionary.put('x', new KeyT9(9,2)); dictionary.put('y', new KeyT9(9,3)); dictionary.put('z', new KeyT9(9,4));
		dictionary.put(' ', new KeyT9(0,1));
		for (int i = 1; i <= cases; i++) {
			char[] line = bi.readLine().toCharArray();
			int lastNum = -1;
			System.out.print("Case #" + i + ": ");
			for (char c : line) {
				KeyT9 ch = dictionary.get(c);
				if (ch.num == lastNum)
					System.out.print(" ");
				for (int j = 0; j < ch.iterations; j++) {
					System.out.print(ch.num);
				}
				lastNum = ch.num;
			}
			System.out.println();
		}
    }
}

class KeyT9{
	public int num;
	public int iterations;
	
	public KeyT9(int num, int iterations) {
		this.num = num;
		this.iterations = iterations;
	}
}
