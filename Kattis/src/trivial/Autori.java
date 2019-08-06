package trivial;

import java.util.*;

public class Autori{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in); 
        String input = scanner.nextLine();
        String[] parts = input.split("-");
        for (int i = 0; i < parts.length; i++){
            System.out.print(parts[i].substring(0,1));
        }
    }
}