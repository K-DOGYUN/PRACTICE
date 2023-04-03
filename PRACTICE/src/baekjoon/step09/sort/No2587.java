package baekjoon.step09.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2587 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] nums = new int[5];
		int avg = 0;

		for (int i = 0; i < nums.length; i++) {
			int num = Integer.parseInt(br.readLine());
			nums[i] = num;
			avg += num / 5;
		}
		
		System.out.println(avg);

		boolean flag = true;
		int cnt = 0;

		while (flag) {
			flag = false;
			cnt++;

			for (int i = 0; i < nums.length - cnt; i++) {

				int lft = nums[i];
				int rgt = nums[i + 1];

				if (lft > rgt) {
					nums[i + 1] = lft;
					nums[i] = rgt;
					flag = true;
				}
			}
		}
		
		System.out.println(nums[2]);
		
		br.close();
	}
}
