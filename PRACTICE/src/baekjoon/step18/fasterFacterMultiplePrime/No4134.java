package baekjoon.step18.fasterFacterMultiplePrime;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No4134 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			long num = Long.parseLong(br.readLine());
			long prime = num;

			if (2 > prime)
				prime = 2;

			while (true) {
				int count = 0;
				for (int j = 2; j <= (int) Math.sqrt((double) prime); j++) {
					if (0 == prime % j) {
						count = 1;
						break;
					}
				}
				if (count == 0)
					break;
				prime++;
			}

			bw.write(Long.toString(prime));
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
