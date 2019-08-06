package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eligibility {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(bi.readLine());
		for (int i = 0; i < cases; i++) {
			String[] student = bi.readLine().split(" ");
			String name = student[0];
			int yearStudies = Integer.parseInt(student[1].split("/")[0]);
			int yearBorn = Integer.parseInt(student[2].split("/")[0]);
			int courses = Integer.parseInt(student[3]);
			
			if (yearStudies >= 2010 || yearBorn >= 1991) System.out.println(name + " eligible");
			else if (courses > 40) System.out.println(name + " ineligible");
			else System.out.println(name + " coach petitions");
		}
	}
}
