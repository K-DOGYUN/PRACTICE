package baekjoon.step54.intensification2;

import java.util.Arrays;
import java.util.Scanner;

public class No1037 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] factors = new int[N];
		
		for (int i = 0; i < factors.length; i++) {
			factors[i] = sc.nextInt();
		}

		Arrays.sort(factors);

		System.out.println(factors[0] * factors[N - 1]);
		
		sc.close();
	}
}
