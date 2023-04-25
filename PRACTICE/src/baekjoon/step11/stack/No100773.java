package baekjoon.step11.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No100773 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());

			if (num == 0)
				stack.pop();
			else
				stack.push(num);
		}

		int ans = 0;

		for (int num : stack)
			ans += num;

		System.out.println(ans);

		br.close();
	}
}
