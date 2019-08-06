package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeathKnightHero {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int lines = Integer.parseInt(bi.readLine());
		int enemiesDefeated = lines;
		for (int i = 0; i < lines; i++) {
			String spells = bi.readLine();
			char lastSpell = ' ';
			for (int j = 0; j < spells.length(); j++) {
				char spell = spells.charAt(j);
				if (spell == 'D' && lastSpell == 'C') {
					enemiesDefeated--;
					break;
				}
				lastSpell = spell;
			}
		}
		System.out.println(enemiesDefeated);
	}
}
