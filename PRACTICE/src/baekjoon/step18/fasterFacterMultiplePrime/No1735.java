package baekjoon.step18.fasterFacterMultiplePrime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1735 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int A1 = Integer.parseInt(st.nextToken());
		int B1 = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		int A2 = Integer.parseInt(st.nextToken());
		int B2 = Integer.parseInt(st.nextToken());

		int B = B1 * B2;

		int A = A1 * B2 + A2 * B1;

		for (int i = 2; i <= (int) Math.sqrt((double) B); i++) {
			while (0 == A % i && 0 == B % i) {
				A /= i;
				B /= i;
			}
		}

		System.out.println(A + " " + B);

		br.close();
	}
}
