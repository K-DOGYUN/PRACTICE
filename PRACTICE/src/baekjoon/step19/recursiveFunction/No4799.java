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

			int pow3 = (int) Math.pow((double) 3, (double) N);
			boolean cantor[] = new boolean[pow3];

			for (int i = 0; i < N; i++) {
				int pow = (int) Math.pow((double) 3, (double) i);

				for (int j = pow; j < pow3; j += 2 * pow) {
					for (int k = j; k < j + pow; k++)
						cantor[k] = true;
				}

			}

			for (int i = 0; i < cantor.length; i++) {
				if (cantor[i])
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
