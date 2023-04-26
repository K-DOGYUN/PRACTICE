package baekjoon.step12.queueDeque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class No1966 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			Queue<Integer> queue = new LinkedList<>();
			Map<Integer, Integer> map = new HashMap<>();

			st = new StringTokenizer(br.readLine(), " ");

			for (int i = 0; i < N; i++) {
				int num = Integer.parseInt(st.nextToken());

				queue.add(num);

				if (map.containsKey(num))
					map.put(num, map.get(num) + 1);
				else
					map.put(num, 1);
			}
			Integer[] arr = map.keySet().toArray(new Integer[map.size()]);
			Arrays.sort(arr, Collections.reverseOrder());
			for(Object key : map.keySet().toArray(new Integer[map.size()]))
				System.out.println(key);
		}
		br.close();
	}
}
