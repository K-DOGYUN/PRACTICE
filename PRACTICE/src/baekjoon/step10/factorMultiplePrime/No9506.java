package baekjoon.step10.factorMultiplePrime;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class No9506 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			String input = br.readLine();
			int n = Integer.parseInt(input);
			int sum = 0;
			if (-1 == n)
				break;

			List<String> fctrs = new ArrayList<>();

			for (int i = 1; i < n; i++) {
				if (0 == n % i) {
					fctrs.add(Integer.toString(i));
					sum += i;
				}
			}

			if (n == sum) {
				System.out.println(input + " = " + String.join(" + ", fctrs));
			} else {
				System.out.println(input + " is NOT perfect.");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
