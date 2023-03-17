package baekjoon.step52.intensification1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No10812 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] MN = br.readLine().split(" ");
		int M = Integer.parseInt(MN[0]);
		int N = Integer.parseInt(MN[1]);
		int[] basket = new int[M];
		int[] preBasket = new int[M];

		for (int i = 0; i < M; i++)
			basket[i] = i + 1;

		for (int i = 0; i < N; i++) {
			String[] IJK = br.readLine().split(" ");
			int I = Integer.parseInt(IJK[0]);
			int J = Integer.parseInt(IJK[1]);
			int K = Integer.parseInt(IJK[2]);

			for (int j = 0; j < M; j++)
				preBasket[j] = basket[j];

			for (int j = 0; j <= J - I; j++) {
				if (K + j - 1 <= J - 1) {
					basket[I + j - 1] = preBasket[K + j - 1];
				} else {
					basket[I + j - 1] = preBasket[I + j - J + K - 2];
				}
			}

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
