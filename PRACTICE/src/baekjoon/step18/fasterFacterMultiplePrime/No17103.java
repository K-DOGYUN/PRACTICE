package baekjoon.step18.fasterFacterMultiplePrime;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class No17103 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		int[] nums = new int[T];

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < T; i++) {
			nums[i] = Integer.parseInt(br.readLine());

			if (max < nums[i])
				max = nums[i];
		}

		Set<Integer> primes = new HashSet<>();

		for (int i = 2; i < max; i++) {
			boolean flag = true;

			for (int j = 2; j <= (int) Math.sqrt((double) i); j++) {

				if (0 == i % j) {
					flag = false;
					break;
				}

			}

			if (flag) {
				primes.add(i);
			}
		}

		for (int i = 0; i < nums.length; i++) {
			int cnt = 0;

			for (int j = 2; j <= nums[i] / 2; j++) {
				if (primes.contains(j) && primes.contains(nums[i] - j))
					cnt++;
			}

			bw.write(Integer.toString(cnt));
			bw.newLine();
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
