package baekjoon.step06.oneDArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No10810 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] MN = br.readLine().split(" ");
		int M = Integer.parseInt(MN[0]);
		int N = Integer.parseInt(MN[1]);
		int[] basket = new int[M];

		for (int i = 0; i < N; i++) {
			String[] IJK = br.readLine().split(" ");
			int I = Integer.parseInt(IJK[0]);
			int J = Integer.parseInt(IJK[1]);
			int K = Integer.parseInt(IJK[2]);

			for (int j = I - 1; j <= J - 1; j++)
				basket[j] = K;
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int i = 0; i < M; i++) {
			bw.write(Integer.toString(basket[i]) + " ");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
