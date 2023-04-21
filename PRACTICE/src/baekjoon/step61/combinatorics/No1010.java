package baekjoon.step61.combinatorics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No1010 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			long N = Long.parseLong(st.nextToken());
			long M = Long.parseLong(st.nextToken());
			long O = M - N;
			long ans = 1;

			if (N > O) {
				for (long j = N + 1; j <= M; j++)
					ans *= j;
				while (O > 0)
					ans /= O--;
			} else {
				for (long j = O + 1; j <= M; j++)
					ans *= j;
				while (N > 0)
					ans /= N--;
			}

			bw.write(Long.toString(ans));
			bw.newLine();
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
