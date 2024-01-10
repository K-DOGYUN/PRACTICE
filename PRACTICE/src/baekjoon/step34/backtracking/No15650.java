package baekjoon.step34.backtracking;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class No15650 {
	
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		
		getSeq(new boolean[N], new int[M], 0, 0);

		bw.flush();
		bw.close();
		sc.close();
	}
	
	private static void getSeq(boolean[] useYn, int[] arr, int depth, int init) throws IOException{
		if (depth == arr.length) {
			for (int i : arr) {
				bw.write(i + " ");
			}
			bw.newLine();
			return;
		}
		
		for (int i = init; i < useYn.length; i++) {
			if (!useYn[i]) {
				useYn[i] = true;
				arr[depth] = i + 1;
				getSeq(useYn, arr, depth + 1, i + 1);
				useYn[i] = false;
			}
		}
	}
}