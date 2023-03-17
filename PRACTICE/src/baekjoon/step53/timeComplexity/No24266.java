package baekjoon.step53.timeComplexity;

import java.util.Scanner;

public class No24266 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();

		long cnt = n * n * n;

		System.out.println(cnt);
		System.out.println(3);
		
		sc.close();
	}
}
