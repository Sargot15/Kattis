package trivial;

import java.util.Scanner;

public class DRMMessages {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String first = rotate(str.substring(0, str.length() / 2));
		String second = rotate(str.substring(str.length() / 2, str.length()));
		
		System.out.println(merge(first,second));
	}
	
	private static String rotate(String str){
		StringBuilder sb = new StringBuilder();
		
		int sum = 0;
		for (int i = 0; i < str.length(); i++){
			sum += str.charAt(i) - 'A';
		}
		sum = sum % 26;
		for (int i = 0; i < str.length(); i++){
			sb.append(sumCharacter(str.charAt(i), sum));
		}
		
		return sb.toString();
	}
	
	private static char sumCharacter(char c, int sum){
		int sumRes = c - 'A' + sum;
		if (sumRes >= 26) return (char)('A' + sumRes - 26);
		return (char)('A' + sumRes);
	}
	
	private static String merge(String str1, String str2){
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str1.length(); i++){
			sb.append(sumCharacter(str1.charAt(i), str2.charAt(i) - 'A'));
		}
		
		return sb.toString();
	}
}
