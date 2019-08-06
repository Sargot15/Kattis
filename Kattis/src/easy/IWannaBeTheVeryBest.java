package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class IWannaBeTheVeryBest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		List<Pokenom> pokenoms = new ArrayList<Pokenom>();
		for ( int i = 0; i < Integer.parseInt(line[0]); i++){
			Pokenom p = new Pokenom(sc.nextLong(), sc.nextLong(), sc.nextLong() ,i);
			pokenoms.add(p);
			sc.nextLine();
		}
		int k = Integer.parseInt(line[1]);
		Set<Integer> idsSelected = new HashSet<Integer>();
		// ATT
		Collections.sort(pokenoms, new Comparator<Pokenom>() {
		    public int compare(Pokenom p1, Pokenom p2) {
		        return p2.att > p1.att ? 1 : -1;
		    }
		});
		for ( int i = 0 ; i < k; i++){
			idsSelected.add(pokenoms.get(i).id);
		}
		// DEF
		Collections.sort(pokenoms, new Comparator<Pokenom>() {
		    @Override public int compare(Pokenom p1, Pokenom p2) {
		    	return p2.def > p1.def ? 1 : -1;
		    }
		});
		for ( int i = 0 ; i < k; i++){
			idsSelected.add(pokenoms.get(i).id);
		}
		// HEA
		Collections.sort(pokenoms, new Comparator<Pokenom>() {
		    @Override public int compare(Pokenom p1, Pokenom p2) {
		        return p2.hea > p1.hea ? 1 : -1;
		    }
		});
		for ( int i = 0 ; i < k; i++){
			idsSelected.add(pokenoms.get(i).id);
		}
		
		System.out.println(idsSelected.size());
		sc.close();
	}
}

class Pokenom{
	long att;
	long def;
	long hea;
	int id;
	
	public Pokenom(long att, long def, long hea, int id) {
		this.att = att;
		this.def = def;
		this.hea = hea;
		this.id = id;
	}
}
