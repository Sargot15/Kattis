package difficulty2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Pivot {
    public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        int amount = Integer.parseInt(bi.readLine());
        String[] numbers = bi.readLine().split(" ");
        int maxNumber = -1;
        Stack<Integer> pivots = new Stack<Integer>();
        for (int i = 0; i < amount; i++){
               int num = Integer.parseInt(numbers[i]);
               if (num > maxNumber){
                      pivots.push(num);
               } else {
                      for (int j = 0; j < pivots.size(); j++){
                             if (num < pivots.peek()){
                                   pivots.pop();
                             } else {
                                   break;
                             }
                      }
               }
               if ( num > maxNumber) maxNumber = num;
        }
        System.out.println(pivots.size());
  }
}
