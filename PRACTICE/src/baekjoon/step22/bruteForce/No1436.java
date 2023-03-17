package baekjoon.step22.bruteForce;

import java.util.Scanner;

public class No1436 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int cnt = 0;
		long num = 665;

		while (true) {
			num++;
			
			String str = Long.toString(num);
			
			if(str.contains("666")) {
				cnt++;
			}
			if(N==cnt) {
				System.out.println(str);
				break;
			}
		}
		
		sc.close();
	}
}
