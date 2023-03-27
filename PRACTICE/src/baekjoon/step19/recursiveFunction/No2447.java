package baekjoon.step19.recursiveFunction;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class No2447 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = sc.nextInt();

		Star star = new Star(N);

		star.sorting();

		for (int i = 0; i < N; i++) {

			for (int j = 0; j < N; j++) {
				if (star.stars[i][j])
					bw.write(" ");
				else
					bw.write("*");
			}
			bw.newLine();
		}

		bw.flush();
		bw.close();
		sc.close();
	}
}

class Star {
	public boolean[][] stars;
	private int k;

	Star(int N) {
		stars = new boolean[N][N];
		k = (int) Math.cbrt(N);
	}

	public void sorting() {
		k = k - 1;
		int n = (int) Math.pow(3, k);

		if (n == 0)
			n = 1;

		for (int i1 = n; i1 < stars.length; i1 += 3 * n) {

			for (int j1 = n; j1 < stars.length; j1 += 3 * n) {

				for (int i2 = i1; i2 < i1 + n; i2++) {

					for (int j2 = j1; j2 < j1 + n; j2++) {
						stars[i2][j2] = true;
					}
				}
			}
		}

		if (k > 0) {
			sorting();
		}
	}
}
