package difficulty2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankQueue {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] data = bi.readLine().split(" ");
		int clients = Integer.parseInt(data[0]);
		int maxClients = Integer.parseInt(data[1]);
		int [] queue = new int [maxClients];
		for(int i = 0; i < clients; i++) {
			String[] client = bi.readLine().split(" ");
			int money = Integer.parseInt(client[0]);
			int leave = Integer.parseInt(client[1]);
			int pos = Math.min(leave, maxClients - 1);
			for (int j = pos; j >= 0; j--) {
				if (queue[j] == 0) {
					queue[j] = money;
					break;
				} else if (queue[j] < money) {
					int aux = queue[j];
					queue[j] = money;
					money = aux;
				}
			}
		}
		int total = 0;
		for (int i = 0; i < queue.length; i++) {
			total += queue[i];
		}
		
		System.out.println(total);
	}
}
