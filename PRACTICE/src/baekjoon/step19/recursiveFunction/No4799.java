package baekjoon.step19.recursiveFunction;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No4799 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			String str = br.readLine();
			if (null == str || str.equals(""))
				break;

			int N = Integer.parseInt(str);

			Cantor c = new Cantor(N);
			c.cantoring(N);

			for (int i = 0; i < c.cantor.length; i++) {
				if (c.cantor[i])
					bw.write(" ");
				else
					bw.write("-");
			}
			bw.newLine();
		}

		bw.flush();
		bw.close();
		br.close();
	}
}

class Cantor {
	boolean[] cantor;

	Cantor(int N) {
		cantor = new boolean[(int) Math.pow(3, N)];
	}

	public void cantoring(int N) {
		int M = (int) Math.pow(3, N - 1);

		if (M == 0)
			M = 1;

		for (int i = M; i < cantor.length; i += 2 * M) {

			for (int j = i; j < i + M; j++) {

				cantor[j] = true;
			}
		}

		if (N > 1)
			cantoring(N - 1);
	}
}
