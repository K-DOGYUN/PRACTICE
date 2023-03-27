package baekjoon.step50.geometryTriangle;

import java.util.Scanner;

public class No14215 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int ans = 0;

		if (a >= b + c) {
			ans = 2 * b + 2 * c - 1;
		}

		else if (b >= a + c) {
			ans = 2 * a + 2 * c - 1;
		}

		else if (c >= a + b) {
			ans = 2 * a + 2 * b - 1;
		}

		else
			ans = a + b + c;
		System.out.println(ans);

		sc.close();
	}
}
