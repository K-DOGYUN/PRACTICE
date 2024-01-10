package baekjoon.step34.backtracking;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class No15651 {
	
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		
		getSeq(N, new int[M], 0);

		bw.flush();
		bw.close();
		sc.close();
	}
	
	private static void getSeq(int N, int[] arr, int depth) throws IOException{
		if (depth == arr.length) {
			for (int i : arr) {
				bw.write(i + " ");
			}
			bw.newLine();
			return;
		}
		
		for (int i = 0; i < N; i++) {
			arr[depth] = i + 1;
			getSeq(N, arr, depth + 1);
		}
	}
}