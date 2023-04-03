package baekjoon.step02.twoDArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2566 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[][] matrix = new int[9][9];
		int row = 1, col = 1;
		int max = 0;

		for (int i = 0; i < 9; i++) {
			String[] rows = br.readLine().split(" ");
			for (int j = 0; j < 9; j++)
				matrix[i][j] = Integer.parseInt(rows[j]);
		}

		for (int i = 0; i < 9; i++) {

			for (int j = 0; j < 9; j++) {
				if (matrix[i][j] > max) {
					max = matrix[i][j];
					row = i + 1;
					col = j + 1;
				}
			}
		}

		System.out.println(max);
		System.out.println(row + " " + col);
		br.close();
	}
}
