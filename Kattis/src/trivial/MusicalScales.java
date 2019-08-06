package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MusicalScales {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] notes = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};
		Map<String, Set<String>> scales = new HashMap<String, Set<String>>();
		for (int i = 0; i < notes.length; i++) {
			Set<String> scale = new HashSet<String>();
			scale.add(notes[i]);
			scale.add(notes[(i + 2) % notes.length]);
			scale.add(notes[(i + 4) % notes.length]);
			scale.add(notes[(i + 5) % notes.length]);
			scale.add(notes[(i + 7) % notes.length]);
			scale.add(notes[(i + 9) % notes.length]);
			scale.add(notes[(i + 11) % notes.length]);
			scale.add(notes[(i + 12) % notes.length]);
			scales.put(notes[i], scale);
		}
		
		int numNotes = Integer.parseInt(bi.readLine());
		String[] notesPlayed = bi.readLine().split(" ");
		for (int i = 0; i < numNotes; i++) {
			if (scales.size() == 0){
				break;
			}
			List<String> toRemove = new ArrayList<String>();
			for (String scale : scales.keySet()) {
				if (!scales.get(scale).contains(notesPlayed[i])){
					toRemove.add(scale);
				}
			}
			for (String remove : toRemove) {
				scales.remove(remove);
			}
		}
		if (scales.size() == 0)
			System.out.println("none");
		else
			for (int i = 0; i < notes.length; i++) {				
				if (scales.containsKey(notes[i]))
					System.out.print(notes[i] + " ");
			}
	}
}
