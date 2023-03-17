package baekjoon.step52.intensification1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class No2444 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = sc.nextInt();

		for (int i = 0; i < N * 2 - 1; i++) {
			int star = -2 * Math.abs(i - N + 1) + N * 2 - 1;
			int blank = Math.abs(i - N + 1);
			String str = "";

			for (int j = 0; j < blank; j++)
				str += " ";

			for (int j = 0; j < star; j++)
				str += "*";
			
			bw.write(str);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		sc.close();
	}
}
