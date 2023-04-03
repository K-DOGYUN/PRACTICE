package baekjoon.step03.iteration;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class No25314 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int count = 1;

		while (N > 4) {
			count++;
			N -= 4;
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int i = 0; i < count; i++) 
			bw.write("long ");
		
		bw.write("int");
		
		bw.flush();
		bw.close();

		sc.close();
	}
}
