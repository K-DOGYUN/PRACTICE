package baekjoon.step08.basicMath;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class No11005 {
	public static void main(String[] args) {
		Map<Integer, String> base = new HashMap<>();

		for (int i = 0; i < 10; i++)
			base.put(i, Integer.toString(i));

		for (int i = 10; i < 36; i++)
			base.put(i, Character.toString(55 + i));

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int B = sc.nextInt();

		String ans = "";

		while (true) {
			if (N < B) {
				ans = base.get(N)+ans;
				break;
			}
			ans = base.get(N%B)+ans;
			N = N/B;
		}

		System.out.println(ans);
		sc.close();
	}
}
