package baekjoon.step10.factorMultiplePrime;

import java.util.Scanner;

public class No2501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N 	 = sc.nextInt();
		int K 	 = sc.nextInt();
		int cnt  = 0;
		int fctr = 0;
				
		for (int i = 1; i <= N; i++) {
			if (0 == N % i)
				cnt++;
			
			if (K == cnt) {
				fctr = i;
				break;
			}
		}
		
		System.out.println(fctr);
		sc.close();
	}
}
