package baekjoon.step06.oneDArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No10813 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] MN = br.readLine().split(" ");
		int M = Integer.parseInt(MN[0]);
		int N = Integer.parseInt(MN[1]);
		int[] basket = new int[M];

		for (int i = 0; i < M; i++)
			basket[i] = i+1;
		
		for (int i = 0; i < N; i++) {
			String[] IJ = br.readLine().split(" ");
			int I = Integer.parseInt(IJ[0]);
			int J = Integer.parseInt(IJ[1]);

			int preI = basket[I-1];
			int preJ = basket[J-1];
			
			basket[J-1] = preI;
			basket[I-1] = preJ;
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int i = 0; i < M; i++) {
			bw.write(Integer.toString(basket[i]) + " ");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
