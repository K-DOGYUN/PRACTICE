package baekjoon.step09.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class No10989 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		Map<Integer, Integer> count = new HashMap<>();

		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			if (count.containsKey(num))
				count.put(num, count.get(num) + 1);
			else {
				count.put(num, 1);
			}
		}

		int[] nums = new int[count.size()];
		int cnt = 0;

		Iterator<Integer> it = count.keySet().iterator();

		while (it.hasNext()) {
			nums[cnt] = (Integer) it.next();
			cnt++;
		}

		nums = mergeSort(nums);

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < count.get(nums[i]); j++) {				
				bw.write(Integer.toString(nums[i]));
				bw.newLine();
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}

	/* 병합 정렬 */
	public static int[] mergeSort(int[] nums) {

		int cnt = 1;
		int[] sorted = new int[nums.length];

		while (true) {

			int setSize = (int) Math.pow(2, cnt);
			int strtPos = 0;

			while (true) {
				if (strtPos >= nums.length)
					break;

				int end = strtPos + setSize - 1;
				int endPos;

				if (nums.length - 1 < end)
					endPos = nums.length - 1;
				else
					endPos = end;

				int size = endPos - strtPos + 1;

				if (size < setSize / 2) {
					strtPos += setSize;
					continue;
				}

				int rStrt = strtPos + setSize / 2;

				int lft = strtPos;

				int rgt;

				if (rStrt >= nums.length)
					rgt = nums.length - 1;
				else
					rgt = rStrt;

				for (int i = strtPos; i < strtPos + size; i++) {

					if (lft == rStrt) {
						sorted[i] = nums[rgt];
						rgt++;

					} else if (rgt > endPos) {
						sorted[i] = nums[lft];
						lft++;

					} else if (nums[lft] <= nums[rgt]) {
						sorted[i] = nums[lft];
						lft++;

					} else {
						sorted[i] = nums[rgt];
						rgt++;
					}
				}

				strtPos += setSize;
			}

			for (int i = 0; i < sorted.length; i++) {
				nums[i] = sorted[i];
			}

			if (setSize >= nums.length)
				break;

			cnt++;
		}

		return nums;
	}
}
