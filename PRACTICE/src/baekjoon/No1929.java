package baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class No1929 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int M = sc.nextInt();
		int N = sc.nextInt();
		int[] arr = new int[N];
		arr[0] = 1;
		for (int i = 2; i <= Math.sqrt(N); i++) {
			for (int j = i + 1; j <= N; j++) {
				if (arr[j - 1] == 0) {
					if (j % i == 0) {
						arr[j - 1] = 1;
					}
				}
			}
		}

		for (int i = M; i <= N; i++) {
			if (arr[i - 1] == 0) {
				bw.write(Integer.toString(i));
				bw.newLine();
			}
		}

		bw.flush();
		sc.close();
		bw.close();
	}
}
