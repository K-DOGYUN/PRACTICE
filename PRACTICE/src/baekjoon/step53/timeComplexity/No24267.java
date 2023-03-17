package baekjoon.step53.timeComplexity;

import java.util.Scanner;

public class No24267 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long cnt = 0;

		cnt = (n - (long) 2) * (n - (long) 1) * ((long) n) / ((long) 6);
		System.out.println(cnt);
		System.out.println(3);
		
		sc.close();
	}
}
