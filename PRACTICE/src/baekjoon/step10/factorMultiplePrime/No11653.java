package baekjoon.step10.factorMultiplePrime;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class No11653 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(sc.nextLine());
		int i = 2;

		while (N != 1) {
			if (N % i == 0) {
				bw.write(Integer.toString(i));
				bw.newLine();
				N /= i;
			} else {
				i++;
			}
		}

		bw.flush();
		bw.close();
		sc.close();
	}
}
