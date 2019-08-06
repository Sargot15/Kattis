package trivial.pendientes;

import java.util.Scanner;

public class Zamka {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String l = sc.nextLine();
		String d = sc.nextLine();
		long x = sc.nextLong();
		
		int min = 0, max = 0;
		for ( int i = 0; i < l.length(); i++){
			min += Character.getNumericValue(l.charAt(i));
		}
		for ( int i = 0; i < d.length(); i++){
			max += Character.getNumericValue(d.charAt(i));
		}
		
		if (min == x) System.out.println(l);
		else if (min > x){
			// Si el min es mayor que X entonces en la última cifra no buscamos el 9 o la mas alta sino que depende de el valor de las otras cifras Y del objetivo
		} else
			for ( int i = 0; i < d.length(); i++){
				
			}
	}
}
