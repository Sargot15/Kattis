package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class HidingPlaces {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numLines = sc.nextLine();
		String[][] board = {{"a8","b8","c8","d8","e8","f8","g8","h8"},
							{"a7","b7","c7","d7","e7","f7","g7","h7"},
							{"a6","b6","c6","d6","e6","f6","g6","h6"},
							{"a5","b5","c5","d5","e5","f5","g5","h5"},
							{"a4","b4","c4","d4","e4","f4","g4","h4"},
							{"a3","b3","c3","d3","e3","f3","g3","h3"},
							{"a2","b2","c2","d2","e2","f2","g2","h2"},
							{"a1","b1","c1","d1","e1","f1","g1","h1"}
		};
		for (int i = 0; i < Integer.parseInt(numLines); i++){
			String location = sc.nextLine();
			Set<String> explored = new HashSet<String>();
			List<String> lastIteration = new ArrayList<String>();
			explored.add(location);
			lastIteration.add(location);
			int movements = 0;
			while (explored.size() < 64){
				List<String> thisIteration = new ArrayList<String>();
				movements++;
				for (String loc : lastIteration){
					int column = loc.charAt(0) - 'a';
					int row = '1' - loc.charAt(1) + 7;
					// UP UP LEFT
					if (column - 1 >= 0 && row - 2 >= 0 && !explored.contains(board[row - 2][column - 1])) {
						explored.add(board[row - 2][column - 1]); 
						thisIteration.add(board[row - 2][column - 1]);
					}
					// UP UP RIGHT
					if (column + 1 < 8 && row - 2 >= 0 && !explored.contains(board[row - 2][column + 1])) {
						explored.add(board[row - 2][column + 1]); 
						thisIteration.add(board[row - 2][column + 1]);
					}
					// UP LEFT LEFT
					if (column - 2 >= 0 && row - 1 >= 0 && !explored.contains(board[row - 1][column - 2])) {
						explored.add(board[row - 1][column - 2]); 
						thisIteration.add(board[row - 1][column - 2]);
					}
					// UP RIGHT RIGHT
					if (column + 2 < 8 && row - 1 >= 0 && !explored.contains(board[row - 1][column + 2])) {
						explored.add(board[row - 1][column + 2]); 
						thisIteration.add(board[row - 1][column + 2]);
					}
					// DOWN LEFT LEFT
					if (column - 2 >= 0 && row + 1 < 8 && !explored.contains(board[row + 1][column - 2])) {
						explored.add(board[row + 1][column - 2]); 
						thisIteration.add(board[row + 1][column - 2]);
					}
					// DOWN RIGHT RIGHT
					if (column + 2 < 8 && row + 1 < 8 && !explored.contains(board[row + 1][column + 2])) {
						explored.add(board[row + 1][column + 2]); 
						thisIteration.add(board[row + 1][column + 2]);
					}
					// DOWN DOWN LEFT
					if (column - 1 >= 0 && row + 2 < 8 && !explored.contains(board[row + 2][column - 1])) {
						explored.add(board[row + 2][column - 1]); 
						thisIteration.add(board[row + 2][column - 1]);
					}
					// DOWN DOWN RIGHT
					if (column + 1 < 8 && row + 2 < 8 && !explored.contains(board[row + 2][column + 1])) {
						explored.add(board[row + 2][column + 1]); 
						thisIteration.add(board[row + 2][column + 1]);
					}
				}
				lastIteration = thisIteration;				
			}
			System.out.print(movements);
			// TODO: Improve how to print result sorted from top to bottom and left to right
			for (int j = 0; j < 8; j++)
				for (int k = 0; k < 8; k++)
					if (lastIteration.contains(board[j][k]))
						System.out.print(" " + board[j][k]);
//				for (String loc : lastIteration)
//				System.out.print(" " + loc);
			
			System.out.println();
		}	
		sc.close();
	}
}
