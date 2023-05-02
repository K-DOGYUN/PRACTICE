package baekjoon.step12.queueDeque;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No1966 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			Queue<Integer> nums = new LinkedList<>();
			Queue<Integer> order = new LinkedList<>();

			st = new StringTokenizer(br.readLine(), " ");

			for (int i = 0; i < N; i++) {
				int num = Integer.parseInt(st.nextToken());
				nums.add(num);
				order.add(i);
			}

			int cnt = 0;

			for (int i = 9; i >= 1; i--) {
				while (nums.contains(i)) {
					if (nums.peek() == i) {
						cnt++;
						nums.poll();
						if (order.poll() == M)
							bw.write(cnt + "\n");
					} else {
						nums.add(nums.poll());
						order.add(order.poll());
					}
				}
			}

		}
		bw.close();
		br.close();
	}
}
