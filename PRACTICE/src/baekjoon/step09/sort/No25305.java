package baekjoon.step09.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No25305 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str1 = br.readLine().split(" ");
		int N = Integer.parseInt(str1[0]);
		int x = Integer.parseInt(str1[1]);

		String[] str2 = br.readLine().split(" ");
		int[] nums = new int[N];

		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(str2[i]);
		}

		int cnt = 0;

		while (x != cnt) {
			cnt++;

			for (int i = 0; i < nums.length - cnt; i++) {

				int lft = nums[i];
				int rgt = nums[i + 1];

				if (lft > rgt) {
					nums[i + 1] = lft;
					nums[i] = rgt;
				}

			}
		}

		System.out.println(nums[nums.length - x]);
	}
}
