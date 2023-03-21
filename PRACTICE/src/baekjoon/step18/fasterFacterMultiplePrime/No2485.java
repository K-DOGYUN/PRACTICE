package baekjoon.step18.fasterFacterMultiplePrime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2485 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[] trees = new int[N];
		int[] distance = new int[N - 1];

		for (int i = 0; i < trees.length; i++) {
			trees[i] = Integer.parseInt(br.readLine());
		}

		for (int i = 0; i < distance.length; i++) {
			distance[i] = trees[i + 1] - trees[i];
		}

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < distance.length; i++) {
			if (min > distance[i])
				min = distance[i];
		}

		int factor = min;

		while (true) {
			int cnt = 0;

			for (int j = 0; j < distance.length; j++) {
				if (0 != distance[j] % factor) {
					cnt = 1;
				}
			}

			if (0 == cnt) {
				break;
			}
			factor--;
		}

		int ans = 0;

		for (int i = 0; i < distance.length; i++) {
			ans += distance[i] / factor - 1;
		}

		System.out.println(ans);
		br.close();
	}
}
