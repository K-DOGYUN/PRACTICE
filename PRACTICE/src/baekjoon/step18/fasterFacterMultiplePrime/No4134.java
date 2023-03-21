package baekjoon.step18.fasterFacterMultiplePrime;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No4134 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			int prime = num;
			
			while(true) {
				for (int j = 0; j < (int) Math.sqrt((double) prime); j++) {
					
				}
			}
				
			bw.write(Integer.toString(prime));
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
