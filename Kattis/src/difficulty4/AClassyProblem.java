package difficulty4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AClassyProblem {
    public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(bi.readLine());
        for(int i = 0; i < cases; i++) {
        	int people = Integer.parseInt(bi.readLine());
        	List<PersonClass> classes = new ArrayList<PersonClass>();
        	for (int j = 0; j < people; j++) {
        		String[] person = bi.readLine().split(" ");
        		PersonClass p = new PersonClass(person[0].substring(0, person[0].length() - 1), person[1].split("-"));
        		classes.add(p);
        	}
        	Collections.sort(classes);
        	
        	for(PersonClass p : classes) {
        		System.out.println(p.name);
        	}
        	System.out.println("==============================");
        }
    }
}


class PersonClass implements Comparable<PersonClass>{
	public double score;
	public String name;
	
	PersonClass(String name, String[] classes){
		this.name = name;
		this.score = 1;
		for (int i = classes.length - 1; i >= 0; i--) {
			switch (classes[i]) {
			case "upper":
				score += Math.pow(10, i - classes.length - 1);
				break;
			case "lower":
				score -= Math.pow(10, i - classes.length - 1);
				break;
			}
		}
	}

	@Override
	public int compareTo(PersonClass p) {
		if (this.score == p.score)
			return this.name.compareTo(p.name);
		else
			return (int)Math.signum(p.score - this.score);
	}
}