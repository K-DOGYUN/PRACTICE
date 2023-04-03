package baekjoon.step08.basicMath;

import java.util.Scanner;

public class No2903 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int dots = 2;

		for (int i = 0; i < N; i++) {
			dots = 2 * dots - 1;
		}

		System.out.println(dots * dots);

		sc.close();
	}
}
