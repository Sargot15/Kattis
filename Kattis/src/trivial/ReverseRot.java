package trivial;

import java.util.Scanner;

public class ReverseRot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] characters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','_','.'};
		while (true){
			String[] text = sc.nextLine().split(" ");
			int rotation = Integer.parseInt(text[0]);
			if (rotation == 0) break;
			StringBuilder res = new StringBuilder();
			for (char c : text[1].toCharArray()){
				int index;
				if (c == '_') index = 'Z' - 'A' + 1; 
				else if (c == '.') index = 'Z' - 'A' + 2; 
				else index = c - 'A';
				res.append(characters[(index + rotation) % characters.length]);
			}
			System.out.println(res.reverse());
		}

		sc.close();
	}
}
