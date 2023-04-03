package baekjoon.step08.basicMath;

import java.util.Scanner;

public class No2355 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long A = sc.nextInt();
		long B = sc.nextInt();

		long sum = 0;
		
		if(A==B)
			sum = A;
		else
			sum = (A+B)*(Math.abs(A-B)+1)/2;

		System.out.println(sum);
		sc.close();
	}
}
