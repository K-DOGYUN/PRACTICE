package baekjoon.step53.timeComplexity;

import java.util.Scanner;

public class No24313 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a1 = sc.nextInt();
		int a0 = sc.nextInt();
		int c = sc.nextInt();
		int n0 = sc.nextInt();

		if (n0 * (c - a1) >= a0 && c >= a1)
			System.out.println(1);
		else
			System.out.println(0);

//		int ans = 1;
//
//		for (int i = n0; i <= 100; i++) {
//			if (a1 * i + a0 > c * i)
//				ans = 0;
//		}
//
//		System.out.println(ans);
		sc.close();
	}
}
