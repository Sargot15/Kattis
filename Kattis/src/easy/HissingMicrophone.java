package easy;

import java.util.Scanner;

public class HissingMicrophone {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        boolean sBefore = false;
        boolean hissing = false;
        for (int i = 0; i < word.length(); i++){
        	if (word.charAt(i) == 's'){
        		if (sBefore) {
        			hissing = true;
        			break;
        		}
        		sBefore = true;
        	}
        	else
        		sBefore = false;
        }
        if (!hissing) System.out.print("no ");
        System.out.println("hiss");
	}
}
