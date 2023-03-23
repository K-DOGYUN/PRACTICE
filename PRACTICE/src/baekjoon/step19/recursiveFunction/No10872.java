package baekjoon.step19.recursiveFunction;

import java.util.Scanner;

public class No10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int factorial = 1;

		for (int i = 1; i <= N; i++) {
			factorial *= i;
		}
		
		System.out.println(factorial);
		
		sc.close();
	}
}
