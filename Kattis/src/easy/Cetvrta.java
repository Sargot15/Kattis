package easy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Cetvrta {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<Long> resultX = new HashSet<Long>();
        Set<Long> resultY = new HashSet<Long>();
        for (int i = 0 ; i < 3; i++){
        	long x = sc.nextLong();
        	if (resultX.contains(x)) resultX.remove(x);
        	else resultX.add(x);
        	long y = sc.nextLong();
        	if (resultY.contains(y)) resultY.remove(y);
        	else resultY.add(y);
        }
        System.out.println(resultX.iterator().next() + " " + resultY.iterator().next());
     }
}
