package difficulty2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumbersOnATree {
    public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] data = bi.readLine().split(" ");
		int length = Integer.parseInt(data[0]);
		String branches = data.length > 1 ? data[1] : "";
		int num = 1;
		for (int i = 1; i <= length; i++) {
			if (i > branches.length())
				num +=(int)Math.pow(2, i);
			else if (branches.charAt(i - 1) == 'L')
				num += (int)Math.pow(2, branches.length() - i);
		}
		
		System.out.println(num);
    }
}
