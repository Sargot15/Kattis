package difficulty2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class ICanGuessTheDataStructure {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String text;
		while ((text = bi.readLine()) != null) {
			int cases = Integer.parseInt(text);
			boolean queue = true, stack = true, priority = true;
			Queue<Integer> que = new LinkedList<Integer>();
			Stack<Integer> sta = new Stack<Integer>();
			Queue<Integer> prio = new PriorityQueue<Integer>(Collections.reverseOrder());
			for (int i = 0; i < cases; i++) {
				String[] data = bi.readLine().split(" ");
				int command = Integer.parseInt(data[0]);
				int num = Integer.parseInt(data[1]);
				if (command == 1) {
					if (queue) que.add(num);
					if (stack) sta.push(num);
					if (priority) prio.add(num);
				} else {
					if (queue) {
						if (que.size() == 0 || que.poll() != num) 
							queue = false;
					}
					if (stack) {
						if (sta.size() == 0 || sta.pop() != num) 
							stack = false;
					}
					if (priority) {
						if (prio.size() == 0 || prio.poll() != num) 
							priority = false;
					}
				}
			}
			if (queue) 
				if (!stack && !priority) System.out.println("queue");
				else System.out.println("not sure");
			else if (stack)
				if (!queue && !priority) System.out.println("stack");
				else System.out.println("not sure");
			else if (priority)
				if (!queue && !stack) System.out.println("priority queue");
				else System.out.println("not sure");
			else 
				System.out.println("impossible");
		}
	}
}
