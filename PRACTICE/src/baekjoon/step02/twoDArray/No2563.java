package baekjoon.step02.twoDArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2563 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int pcs = Integer.parseInt(br.readLine());
		int[][] paper = new int[100][100];

		for (int i = 0; i < pcs; i++) {
			String[] pstn = br.readLine().split(" ");
			int row = Integer.parseInt(pstn[0]);
			int col = Integer.parseInt(pstn[1]);
			for (int j = row; j < row + 10; j++) {
				for (int k = col; k < col + 10; k++) {
					paper[j][k] = 1;
				}
			}
		}

		int sum = 0;
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++)
				sum += paper[i][j];
		}
		
		System.out.println(sum);
		br.close();
	}
}
