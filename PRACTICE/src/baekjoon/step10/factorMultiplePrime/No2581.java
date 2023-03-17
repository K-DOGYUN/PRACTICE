package baekjoon.step10.factorMultiplePrime;

import java.util.Scanner;

public class No2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();
		int[] prime = new int[N + 1];
		prime[0] = 1;
		prime[1] = 1;

		for (int i = 2; i <= (int) Math.sqrt(N); i++) {
			for (int j = 2 * i; j <= N; j += i) {
				prime[j] = 1;
			}
		}

		int sum = 0;
		int min = 0;

		for (int i = N; i >= M; i--) {
			if (prime[i] == 0) {
				sum += i;
				min = i;
			}
		}
		if (sum == 0) {
			System.out.println("-1");
		}
		System.out.println(sum);
		System.out.println(min);
		sc.close();
	}
}
