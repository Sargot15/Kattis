package trivial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StackingCups {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Cup> cups = new ArrayList<Cup>();
		String lines = sc.nextLine();
		for (int i = 0; i < Integer.parseInt(lines); i++){
			String[] line = sc.nextLine().split(" ");
			if (isInteger(line[0])){
				Cup c = new Cup(Integer.parseInt(line[0]) / 2, line[1]);
				cups.add(c);
			} else {
				Cup c = new Cup(Integer.parseInt(line[1]), line[0]);
				cups.add(c);
			}
		}
		Collections.sort(cups);
		for (Cup c : cups){
			System.out.println(c.color);
		}
		sc.close();
	}
	
	public static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    return true;
	}
}

class Cup implements Comparable<Cup>{
	int size;
	String color;
	public Cup(int size, String color) {
		this.size = size;
		this.color = color;
	}
	@Override
	public int compareTo(Cup arg0) {
		return this.size - arg0.size;
	}	
}