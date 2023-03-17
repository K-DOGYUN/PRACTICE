package baekjoon.step9.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No1427 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] N = br.readLine().split("");
		int[] nums = new int[N.length];

		for (int i = 0; i < N.length; i++) {
			nums[i] = Integer.parseInt(N[i]);
		}

		for (int i = 1; i < nums.length; i++) {
			for (int j = 0; j < nums.length - i; j++) {
				int lft = nums[j];
				int rgt = nums[j + 1];
				if (lft < rgt) {
					nums[j] = rgt;
					nums[j + 1] = lft;
				}
			}
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int i = 0; i < nums.length; i++) {
			bw.write(Integer.toString(nums[i]));
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
