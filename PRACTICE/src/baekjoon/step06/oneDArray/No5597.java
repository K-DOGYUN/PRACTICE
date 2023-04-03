package baekjoon.step06.oneDArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No5597 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] submits = new int[28];
		int cnt = 0;

		for (int i = 0; i < submits.length; i++) {
			submits[i] = Integer.parseInt(br.readLine());
		}

		for (int i = 0; i < 30; i++) {
			for (int j = 0; j < submits.length; j++) {
				if (i + 1 == submits[j]) {
					cnt = 1;
					break;
				}
			}
			if (cnt == 0) {
				bw.write(Integer.toString(i + 1));
				bw.newLine();
			}
			cnt = 0;
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
