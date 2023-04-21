package baekjoon.step61.combinatorics;

import java.util.Scanner;

public class No11050 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int L = N-K;
		int ans = 1;
		
		while(N>0) 
			ans *= N--;
		while(K>0) 
			ans /= K--;
		while(L>0) 
			ans /= L--;
		
		System.out.println(ans);
		
		sc.close();
	}
}
