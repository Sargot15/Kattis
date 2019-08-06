package trivial;

import java.util.Scanner;

public class Bela {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String dominant = sc.nextLine();
        int total = 0;
        String numberhands = dominant.split(" ")[0];
        for (int i = 0; i < Integer.parseInt(numberhands) * 4 && sc.hasNextLine(); i++){
//        while (sc.hasNextLine()){
        	String card = sc.nextLine();
        	switch (card.charAt(0)){
        	case 'A':
        		total += 11;
        		break;
        	case 'K':
        		total += 4;
        		break;
        	case 'Q':
        		total += 3;
        		break;
        	case 'J':
        		if (card.charAt(card.length() - 1) == dominant.charAt(dominant.length() - 1)) total += 20;
        		else total += 2;
        		break;
        	case 'T':
        		total += 10;
        		break;
        	case '9':
        		if (card.charAt(card.length() - 1) == dominant.charAt(dominant.length() - 1)) total += 14;
        		break;
        	default:
        	}
        }
        System.out.println(total);
     }
}
