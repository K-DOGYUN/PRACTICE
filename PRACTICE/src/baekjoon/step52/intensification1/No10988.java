package baekjoon.step52.intensification1;

import java.util.Scanner;

public class No10988 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] str = sc.nextLine().split("");
		int ans = 1;

		for (int i = 0; i < str.length; i++) {
			if (!str[i].equals(str[str.length - i - 1]))
				ans = 0;
		}

		System.out.println(ans);

		sc.close();
	}
}
