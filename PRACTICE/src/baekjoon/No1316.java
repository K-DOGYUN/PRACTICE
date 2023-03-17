package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No1316 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int count = N;

		for (int i = 0; i < N; i++) {
			boolean[] check = new boolean[26];
			String str = br.readLine();
			int prev = 0;

			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) != prev) {
					prev = str.charAt(j);
					if (!check[str.charAt(j) - 97]) {
						check[str.charAt(j) - 97] = true;
					} else {
						count--;
						break;
					}
				}
			}

		}

		bw.write(Integer.toString(count));
		bw.newLine();
		bw.flush();
		bw.close();
		br.close();
	}
}
