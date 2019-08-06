package trivial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Server {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] line = bi.readLine().split(" ");
		int numTasks = Integer.parseInt(line[0]);
		int timeServer = Integer.parseInt(line[1]);
		int cont = 0;
		String[] tasks = bi.readLine().split(" ");
		while (cont < numTasks){
			int timeTask = Integer.parseInt(tasks[cont]);
			if ( timeServer - timeTask < 0) break;
			timeServer -= timeTask;
			cont++;
		}
		
	System.out.println(cont);
	}
}
