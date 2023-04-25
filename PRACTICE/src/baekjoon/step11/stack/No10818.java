package baekjoon.step11.stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class No10818 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			String str = st.nextToken();

			if (str.equals("push"))
				stack.push(Integer.parseInt(st.nextToken()));
			else if (str.equals("pop"))
				try {
					bw.write(stack.pop() + "\n");
				} catch (Exception e) {
					bw.write("-1" + "\n");
				}
			else if (str.equals("size"))
				bw.write(stack.size() + "\n");
			else if (str.equals("empty")) {
				if (stack.empty())
					bw.write(1 + "\n");
				else
					bw.write(0 + "\n");
			} else if (str.equals("top")) {
				try {
					bw.write(stack.peek() + "\n");
				} catch (Exception e) {
					bw.write("-1" + "\n");
				}
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
