package baekjoon.step34.backtracking;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class No15649 {
	
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[M];
		boolean[] useYn = new boolean[N];
		
		seq(N, M, 0, arr, useYn);

		bw.flush();
		bw.close();
		sc.close();
	}
	
	private static void seq(int N, int M, int depth, int[] arr, boolean[] useYn) throws IOException {
		if (M == depth) {
			for (int i : arr) {
				bw.write(i + " ");
			}
			bw.newLine();
			
			return;
		}
		
		for (int i = 0; i < N; i++) {
			if (useYn[i] == false) {
				useYn[i] = true;
				arr[depth] = i + 1;
				seq(N, M, depth + 1, arr, useYn);
				useYn[i] = false;
			}
		}
	}
}