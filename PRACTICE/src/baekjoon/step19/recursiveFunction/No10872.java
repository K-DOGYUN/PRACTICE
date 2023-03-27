package baekjoon.step19.recursiveFunction;

import java.util.Scanner;

public class No10872 {
	static int ans = 1;

	public static void factorial(int N, int i) {
		if(N>i)
			factorial(N, i+1);
		
		ans*=i;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		factorial(N, 1);
		
		System.out.println(ans);

		sc.close();

	}

}
