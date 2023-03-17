package baekjoon.step2.twoDArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No10798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[][] matrix = new String[5][15];

		for (int i = 0; i < 5; i++) {
			String[] rows = br.readLine().split("");
			for (int j = 0; j < rows.length; j++) {
				matrix[i][j] = rows[j];
			}
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if(matrix[j][i] != null)
					bw.write(matrix[j][i]);
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
