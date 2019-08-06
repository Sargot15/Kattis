package trivial;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long fizz = sc.nextLong();
        long buzz = sc.nextLong();
        long numbers = sc.nextLong();
        for (int i = 1; i <= numbers; i++){
        	StringBuilder result = new StringBuilder();
        	if (i % fizz == 0) result.append("Fizz");
        	if (i % buzz == 0) result.append("Buzz");
        	if (result.length() == 0) result.append(i);
        	System.out.println(result);
        }
     }
}
