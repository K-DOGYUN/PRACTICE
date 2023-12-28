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
		
		row(N, M);

		bw.flush();
		bw.close();
		sc.close();
	}
	
	private static void row(int N, int M) throws IOException {
		if (N > 1) row(N - 1, M);
		
		bw.write(N + " " + M);
		bw.newLine();
	}
//	
//	private static void col(int N, int M) {
//		if (N > 1) col(N - 1, M);
//		
//		for (int i = 0; i < M; i++) {
//			
//		}
//	}
}