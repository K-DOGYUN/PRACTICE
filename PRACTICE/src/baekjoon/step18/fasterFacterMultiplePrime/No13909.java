package baekjoon.step18.fasterFacterMultiplePrime;

import java.util.Scanner;

public class No13909 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		while (true) {
//
//			int N = sc.nextInt();
//
//			if (N == 0)
//				break;
//
//			boolean[] win = new boolean[N];
//
//			for (int i = 1; i <= N; i++) {
//				for (int j = i; j <= N; j += i) {
//					if (win[j - 1])
//						win[j - 1] = false;
//					else
//						win[j - 1] = true;
//				}
//			}
//
//			int cnt = 0;
//
//			for (int i = 0; i < win.length; i++) {
//				if (win[i])
//					cnt++;
//			}
//
//			System.out.println(cnt);
//		}
		int N = sc.nextInt();
		System.out.println((int) Math.sqrt((double) N));
		sc.close();
	}
}
