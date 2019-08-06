package trivial;

import java.util.Scanner;

public class Sibice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLong()) {
           long numMatches = sc.nextLong(), w = sc.nextLong(), h = sc.nextLong();
           for (int i = 1; i <= numMatches; i++){
               long length = sc.nextLong();
               if (length > Math.sqrt(Math.pow(w,2) + Math.pow(h,2)))
                    System.out.println("NE");
                else
                    System.out.println("DA");
           }
        }
    }
}