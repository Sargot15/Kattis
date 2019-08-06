package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelpAPhd {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int lines = Integer.parseInt(bi.readLine());
		for (int i = 0; i < lines; i++) {
			String operation = bi.readLine();
			if ("P=NP".equals(operation)){
				System.out.println("skipped");
			} else{
				int res = Integer.parseInt(operation.split("\\+")[0]) + Integer.parseInt(operation.split("\\+")[1]);
				System.out.println(res);
			}
		}		
	}
}
