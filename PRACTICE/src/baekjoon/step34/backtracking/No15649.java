package baekjoon.step34.backtracking;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class No15649 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = sc.nextInt();
		int M = sc.nextInt();

		Seq seq = new Seq(N, M);
		seq.sorting(N, M, seq.cnt);

		for (int i = 1; i <= N ; i++) {

		}

		bw.flush();
		bw.close();
		sc.close();
	}

}

class Seq {
	public int[][] arr;
	public int cnt = 1;

	Seq(int N, int M) {

		for (int i = N; i > N - M; i--) {
			cnt *= N;
		}

		arr = new int[cnt][M];
	}

	public void sorting(int N, int M, int cnt) {
		if (N > 1)
			sorting(N - 1, M, cnt);
	}
}
