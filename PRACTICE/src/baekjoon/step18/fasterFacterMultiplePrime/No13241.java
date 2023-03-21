package baekjoon.step18.fasterFacterMultiplePrime;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No13241 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long lstComm = 0;
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		if (A == B)
			lstComm = A;
		
		else if (A > B) {
			int cnt = 1;
			
			while (true) {
				long mult = (long) A * cnt;
				
				if (0 == mult % B) {
					lstComm = mult;
					break;
				}
				
				cnt++;
			}
		}
		
		else if (A < B) {
			int cnt = 1;
			
			while (true) {
				long mult = (long) B * cnt;
				
				if (0 == mult % A) {
					lstComm = mult;
					break;
				}
				
				cnt++;
			}
		}
		
		bw.write(Long.toString(lstComm));
		bw.newLine();

		bw.flush();
		bw.close();
		br.close();
	}
}
