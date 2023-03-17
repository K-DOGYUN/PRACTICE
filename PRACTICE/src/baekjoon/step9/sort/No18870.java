package baekjoon.step9.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class No18870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		int nums[] = new int[N];
		int sorted[] = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}

		sorted = nums.clone();
		Arrays.sort(sorted);

		Map<Integer, Integer> coord = new HashMap<>();

		int cnt = 0;
		for (int i = 0; i < N; i++) {
			if (!coord.containsKey(sorted[i])) {
				coord.put(sorted[i], cnt);
				cnt++;
			}
		}

		for (int i = 0; i < N; i++) {
			sb.append(coord.get(nums[i])).append(" ");
		}

		System.out.println(sb);

		br.close();
	}
}
