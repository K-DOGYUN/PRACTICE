package baekjoon.step19.recursiveFunction;

import java.util.Scanner;

public class No10870 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		fibonacci f = new fibonacci();

		f.next(n);

		if (0 == n)
			System.out.println(0);
		else
			System.out.println(f.fibo);

		sc.close();
	}
}

//		fibonacci
class fibonacci {
	int fibo;
	int fiboPre;

	fibonacci() {
		fibo = 0;
		fiboPre = 1;
	}

	public void next(int n) {
		int sum = fibo + fiboPre;
		fiboPre = fibo;
		fibo = sum;

		if (n > 1) {
			next(n - 1);
		}
	}
}