package baekjoon.step22.bruteForce;

import java.io.IOException;
import java.util.Scanner;

public class No2839 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.nextLine());
		int count5 = 0, count3 = 0;
		int ans=0;

		if (N % 5 == 0)
			ans = N / 5;
		else {
			while (N > 5) {
				count5++;
				N -= 5;
				if (N % 3 == 0) {
					count3 = N / 3;
					ans = count3 + count5;
				}
			}
			if (count3 == 0) {
				if ((N + count5 * 5) % 3 == 0)
					ans = (N + count5 * 5) / 3;
				else
					ans = -1;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
