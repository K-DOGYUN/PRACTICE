package baekjoon.step19.recursiveFunction;

import java.util.Scanner;

public class No10870 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int fibo1 = 0;
		int fibo2 = 1;

		for (int i = 0; i < n - 1; i++) {
			if (fibo1 < fibo2)
				fibo1 = fibo1 + fibo2;
			else
				fibo2 = fibo1 + fibo2;
		}
		
		if (0==n)
			System.out.println(0);
		else if (fibo1 < fibo2)
			System.out.println(fibo2);
		else
			System.out.println(fibo1);

		sc.close();
	}
}
//		fibonacci
