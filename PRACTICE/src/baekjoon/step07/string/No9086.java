package baekjoon.step07.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No9086 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int i = 0; i < T; i++) {
			String[] str = br.readLine().split("");
			bw.write(str[0]);
			bw.write(str[str.length-1]);
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
