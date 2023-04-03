package baekjoon.step06.oneDArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No10807 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		String[] numbers = br.readLine().split(" ");
		String v = br.readLine();

		int cnt = 0;

		for (int i = 0; i < N; i++) {
			if (numbers[i].equals(v)) {
				cnt++;
			}
		}
		
		bw.write(Integer.toString(cnt));
		bw.flush();
		bw.close();
		br.close();
	}
}
