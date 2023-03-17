package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No3003 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] needNumber = { 1, 1, 2, 2, 2, 8 };
		String[] answer = new String[6];
		
		String[] numberOfPiece = bf.readLine().split(" ");
		
		for (int i = 0; i < 6; i++) {
			answer[i] = String.valueOf(needNumber[i] - Integer.parseInt(numberOfPiece[i]));
		}
		
		bw.write(String.join(" ", answer)+"\n");
		bw.flush();
		bw.close();
	}
}
