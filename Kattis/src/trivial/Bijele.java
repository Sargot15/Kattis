package trivial;

import java.util.Scanner;

public class Bijele {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] pieces = sc.nextLine().split(" ");
        int[] completes = {1,1,2,2,2,8};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < completes.length; i++){
        	sb.append(completes[i] - Integer.parseInt(pieces[i]) + " ");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}
