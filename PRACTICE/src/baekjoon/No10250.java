package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No10250 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			String[] Hotel = br.readLine().split(" ");
			int H = Integer.parseInt(Hotel[0]);
			int N = Integer.parseInt(Hotel[2]);
			int count = 1;
			
			while (N > H) {
				N -= H;
				count++;
			}
			
			String room = Integer.toString(N);
			
			if (count < 10)
				room += "0" + count;
			else
				room += count;
			bw.write(room);
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
