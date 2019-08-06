package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Modulo {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		Set<Integer> modulos = new HashSet<Integer>();
		for (int i = 0; i < 10; i++){
			int number = Integer.parseInt(bi.readLine());
			modulos.add(number % 42);
		}
		System.out.println(modulos.size());
	}
}
