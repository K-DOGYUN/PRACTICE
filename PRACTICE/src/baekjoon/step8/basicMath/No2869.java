package baekjoon.step8.basicMath;

import java.util.Scanner;

public class No2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = sc.nextLine().split(" ");

		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		int V = Integer.parseInt(str[2]);
		int ans = (V - A) / (A - B);

		if ((V - A) % (A - B) == 0)
			System.out.println(ans + 1);
		else
			System.out.println(ans + 2);

		sc.close();
	}
}
