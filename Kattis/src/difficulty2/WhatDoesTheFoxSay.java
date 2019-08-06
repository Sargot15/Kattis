package difficulty2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class WhatDoesTheFoxSay {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(bi.readLine());		
		for (int i = 0; i < cases; i++){
			String[] sounds = bi.readLine().split(" ");
			String text;
			Set<String> animalSounds = new HashSet<String>();
			while ( !(text = bi.readLine()).equals("what does the fox say?")) {
				animalSounds.add(text.split(" ")[2]);
			}
			
			for (int j = 0; j < sounds.length; j++) {
				if (!animalSounds.contains(sounds[j]))
					System.out.print(sounds[j] + " ");
			}
			System.out.println();
		}
	}
}
