package difficulty2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortOfSorting {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String text;
		while ((text = bi.readLine()) != null) {
			int cases = Integer.parseInt(text);
			if (cases == 0) break;
			List<String> names = new ArrayList<String>();
			for(int i = 0; i < cases; i++) {
				names.add(bi.readLine());
			}
			Collections.sort(names, new LexicographicComparator());
			
			for(String s : names) {
				System.out.println(s);
			}
			System.out.println();
		}
	}
}

class LexicographicComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
    	if (a.charAt(0) - 'A' < b.charAt(0) -'A')
    		return -1;
    	else if (a.charAt(0) - 'A' > b.charAt(0) -'A')
    		return 1;
    	else if (a.charAt(1) - 'A' < b.charAt(1) -'A')
    		return -1;
    	else if (a.charAt(1) - 'A' > b.charAt(1) -'A')
    		return 1;
        return 0;
    }
}