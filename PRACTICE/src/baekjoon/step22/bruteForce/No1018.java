package baekjoon.step22.bruteForce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No1018 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		String[][] board = new String[N][M];

		for (int i = 0; i < N; i++) {
			String[] str = br.readLine().split("");

			for (int j = 0; j < M; j++) {
				board[i][j] = str[j];
			}
		}

		String[][] chess1 = new String[8][8];
		String[][] chess2 = new String[8][8];

		for (int i = 0; i < 8; i++) {
			if (0 == i % 2) {
				chess1[i] = "WBWBWBWB".split("");
				chess2[i] = "BWBWBWBW".split("");
			} else {
				chess1[i] = "BWBWBWBW".split("");
				chess2[i] = "WBWBWBWB".split("");
			}
		}

		int cnt = Integer.MAX_VALUE;

		for (int i = 0; i < N - 7; i++) {
			for (int j = 0; j < M - 7; j++) {
				int cnt1 = 0;
				int cnt2 = 0;

				for (int k = 0; k < 8; k++) {
					for (int l = 0; l < 8; l++) {
						if (board[i + k][j + l].equals(chess1[k][l]))
							cnt1++;
						if (board[i + k][j + l].equals(chess2[k][l]))
							cnt2++;
					}
				}

				if (cnt > cnt1)
					cnt = cnt1;
				if (cnt > cnt2)
					cnt = cnt2;
			}
		}
		
		bw.write(Integer.toString(cnt));
		bw.flush();
		bw.close();
		br.close();
	}
}
