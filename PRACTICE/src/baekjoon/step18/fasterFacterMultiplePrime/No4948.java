package baekjoon.step18.fasterFacterMultiplePrime;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No4948 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			int num = Integer.parseInt(br.readLine());

			if (0 == num)
				break;

			int cnt = 0;

			for (int i = num + 1; i <= 2 * num; i++) {
				boolean flag = true;

				for (int j = 2; j <= (int) Math.sqrt((double) i); j++) {
					if (0 == i % j) {
						flag = false;
						break;
					}
				}
				
				if(flag) {
					cnt++;
				}
			}
			
			bw.write(Integer.toString(cnt));
			bw.newLine();
		}

		bw.flush();
		bw.close();
		bw.close();
	}
}
