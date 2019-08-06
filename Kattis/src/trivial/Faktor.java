package trivial;

import java.util.Scanner;

public class Faktor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long articles = sc.nextLong();
        long impact = sc.nextLong();
        System.out.println(articles * (impact - 1) + 1);
     }
}
