package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No1712 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str = br.readLine().split(" ");
		
		int bePoint = breakevenPoint(
				Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2])
				);
		
		bw.write(Integer.toString(bePoint));
		bw.newLine();
		bw.flush();
		bw.close();
		br.close();
	}

	public static int breakevenPoint(int A, int B, int C) {
		int bePoint;
		if (B >= C)
			bePoint = -1;
		else
			bePoint = A / (C - B) + 1;
		return bePoint;
	}
}
