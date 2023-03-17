package baekjoon.step22.bruteForce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int digits = Integer.toString(N).length();
		int lft;

		if (0 <= N - 10 * digits)
			lft = 1;
		else
			lft = N - 10 * digits;

		List<Integer> nums = new ArrayList<>();

		for (int i = lft; i < N; i++) {
			int num = i;
			int sum = num;

			for (int j = 0; j < digits; j++) {
				sum += num % 10;
				num /= 10;
			}
			if (sum == N)
				nums.add(i);
		}
		
		if(0 == nums.size())
			nums.add(0);
		
		System.out.println(nums.get(0));
		sc.close();
	}
}
