package difficulty2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoZeroFourEight {
	
	public static final int SIZE = 4;
	
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[][] board = new String[SIZE][SIZE];
		for (int i = 0; i < SIZE; i++) {
			board[i] = bi.readLine().split(" ");
		}
		int direction = Integer.parseInt(bi.readLine());
		int[][] result = new int[SIZE][SIZE];
		for (int i = 0; i < SIZE; i++) {
			int indexPosNextNumber = -1;
			int lastNumber = -1;
			if( direction > 1) indexPosNextNumber = SIZE;
			for (int j = 0; j < SIZE; j++) {
				int num;
				switch (direction){
				case 0:
					num = Integer.parseInt(board[i][j]);
					if (num != 0) {
						if (num == lastNumber) {
							result[i][indexPosNextNumber] = num * 2;
							lastNumber = -1;
						}
						else {
							result[i][++indexPosNextNumber] = num;
							lastNumber = num;
						}
					}
					break;
				case 1:
					num = Integer.parseInt(board[j][i]);
					if (num != 0) {
						if (num == lastNumber) {
							result[indexPosNextNumber][i] = num * 2;
							lastNumber = -1;
						}
						else {
							result[++indexPosNextNumber][i] = num;
							lastNumber = num;
						}
					}
					break;
				case 2:
					num = Integer.parseInt(board[i][SIZE - 1 - j]);
					if (num != 0) {
						if (num == lastNumber) {
							result[i][indexPosNextNumber] = num * 2;
							lastNumber = -1;
						}
						else {
							result[i][--indexPosNextNumber] = num;
							lastNumber = num;
						}
					}
					break;
				case 3:
					num = Integer.parseInt(board[SIZE - 1 - j][i]);
					if (num != 0) {
						if (num == lastNumber) {
							result[indexPosNextNumber][i] = num * 2;
							lastNumber = -1;
						}
						else {
							result[--indexPosNextNumber][i] = num;
							lastNumber = num;
						}
					}
					break;
				}
			}
		}
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
