package baekjoon.step19.recursiveFunction;

import java.util.Scanner;

public class No27433 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		
		long ans = 1;
		
		while (N != 0) {
			ans *= N--;
		}
		
		System.out.println(ans);
		
		sc.close();
	}
}