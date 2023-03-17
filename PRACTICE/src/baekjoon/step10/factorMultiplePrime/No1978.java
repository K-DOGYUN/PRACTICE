package baekjoon.step10.factorMultiplePrime;

import java.util.Scanner;

public class No1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = N;

		for (int i = 0; i < N; i++) {
			int n = sc.nextInt();
			if (n < 2)
				count--;
			for (int j = 2; j <= (int) Math.sqrt(n); j++) {
				if (n % j == 0) {
					count--;
					break;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}
