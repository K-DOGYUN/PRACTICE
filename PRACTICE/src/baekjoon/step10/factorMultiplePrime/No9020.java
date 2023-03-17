package baekjoon.step10.factorMultiplePrime;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class No9020 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		List<Integer> prime = new ArrayList<Integer>();

		for (int i = 2; i < 10000; i++) {
			boolean flag = true;

			for (int j = 2; j <= (int) Math.sqrt(i); j++) {
				if (0 == i % j) {
					flag = false;
				}
			}

			if (true == flag)
				prime.add(i);
		}

		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			String lft = "";
			String rgt = "";
			int dif = n;
			for (int j : prime) {
				if (j > n)
					break;

				int abs = Math.abs(n - 2 * j);
						
				if (prime.contains(n - j) && dif > abs) {
					dif = Math.abs(n - 2 * j);
					lft = Integer.toString(j);
					rgt = Integer.toString(n - j);
				}
			}
			bw.write(lft + " " + rgt);
			bw.newLine();
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
