package baekjoon.step8.basicMath;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No2720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			int num = Integer.parseInt(br.readLine());
			
			bw.write(Integer.toString(num/25)+" ");
			num = num%25;
			
			bw.write(Integer.toString(num/10)+" ");
			num = num%10;
			
			bw.write(Integer.toString(num/5)+" ");
			num = num%5;
			
			bw.write(Integer.toString(num));
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
