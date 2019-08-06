package trivial;

import java.util.*;

public class Planina{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       long index = sc.nextLong();
       System.out.printf("%.0f", Math.pow(Math.pow(2, index) + 1,2));
    }
}