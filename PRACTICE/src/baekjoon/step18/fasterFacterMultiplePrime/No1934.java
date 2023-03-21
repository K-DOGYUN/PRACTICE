package baekjoon.step18.fasterFacterMultiplePrime;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No1934 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		int lstComm = 0;

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			if (A == B)
				lstComm = A;

			else if (A > B) {
				int cnt = 1;

				while (true) {
					int mult = A * cnt;

					if (0 == mult % B) {
						lstComm = mult;
						break;
					}

					cnt++;
				}
			}

			else if (A < B) {
				int cnt = 1;

				while (true) {
					int mult = B * cnt;

					if (0 == mult % A) {
						lstComm = mult;
						break;
					}

					cnt++;
				}
			}

			bw.write(Integer.toString(lstComm));
			bw.newLine();
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
