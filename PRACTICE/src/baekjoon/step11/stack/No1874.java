package baekjoon.step11.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No1874 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		int pre = 0;

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());

			if (num > pre) {
				for (int j = pre + 1; j <= num; j++) {
					stack.add(j);
					sb.append("+\n");
				}
				pre = num;
			}
			
			if(num != stack.peek()) {
				System.out.println("NO");
				return;
			}
			
			stack.pop();
			sb.append("-\n");
		}

		System.out.println(sb);
		br.close();
	}
}
