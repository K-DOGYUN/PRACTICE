package baekjoon.step3.iteration;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No25304 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int X, N, a, b;
		int total = 0;
		String purchase;

		X = Integer.parseInt(br.readLine());
		N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			purchase = br.readLine();
			a = Integer.parseInt(purchase.split(" ")[0]);
			b = Integer.parseInt(purchase.split(" ")[1]);
			total += a*b;
		}
		
		if (total == X) {
			bw.write("Yes");
			bw.newLine();
			bw.flush();
		} else {
			bw.write("No");
			bw.newLine();
			bw.flush();
		}
		bw.close();
		br.close();
	}
}
