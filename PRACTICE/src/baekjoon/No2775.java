package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No2775 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			int[][] apt = new int[k + 1][n];

			for (int j = 0; j < k + 1; j++) {
				for (int l = 0; l < n; l++) {
					if (j == 0)
						apt[j][l] = l+1;
					else {
						for (int m = 0; m <= l; m++) {
							apt[j][l] += apt[j-1][m];
						}
					}
				}
			}
			bw.write(Integer.toString(apt[k][n-1]));
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
