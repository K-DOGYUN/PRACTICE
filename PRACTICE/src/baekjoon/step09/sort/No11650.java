package baekjoon.step09.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class No11650 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		Map<Integer, List<Integer>> coord = new HashMap<>();

		for (int i = 0; i < N; i++) {
			String[] str = br.readLine().split(" ");
			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[1]);

			if (coord.get(x) == null) {
				coord.put(x, new ArrayList<Integer>());
				coord.get(x).add(y);
			}

			else {
				coord.get(x).add(y);
			}
		}

		int[] nums = new int[coord.size()];
		int cnt = 0;

		Iterator<Integer> it = coord.keySet().iterator();

		while (it.hasNext()) {
			nums[cnt] = it.next();
			cnt++;
		}

		nums = mergeSort(nums);

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		it = coord.keySet().iterator();

		for (int i = 0; i < nums.length; i++) {
			
			int x = nums[i];
			List<Integer> arrY = coord.get(x);

			if (arrY.size() != 1) {
				
				arrY.sort(null);
				
				for (int j = 0; j < arrY.size(); j++) {
					bw.write(Integer.toString(x) + " " + Integer.toString(arrY.get(j)));
					bw.newLine();
				}
			}

			else {
				bw.write(Integer.toString(x) + " " + Integer.toString(arrY.get(0)));
				bw.newLine();
			}

		}

		bw.flush();
		bw.close();
		br.close();
	}

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
