package baekjoon.step53.timeComplexity;

import java.util.Scanner;

public class No24265 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long cnt = 0;

//		for (long i = 1; i <= n - 1; i++) {
//			cnt += n - i;
//		}
		
		cnt = (n-1)*(n)/2;
		

		System.out.println(cnt);
		System.out.println(2);
		sc.close();
	}
}
