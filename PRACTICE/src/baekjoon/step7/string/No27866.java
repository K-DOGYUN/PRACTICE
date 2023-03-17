package baekjoon.step7.string;

import java.util.Scanner;

public class No27866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] S = sc.nextLine().split("");
		int i = sc.nextInt();
		
		System.out.println(S[i-1]);
		
		sc.close();
	}
}
