package baekjoon.step11.stackQueDeq;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class No4949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			String str = br.readLine();
			if (str.equals("."))
				break;

			String[] strs = new String[str.length()];
			strs = str.split("");

			Stack<Integer> stack = new Stack<>();

			String ans = "yes";

			for (int i = 0; i < strs.length; i++) {
				if (strs[i].equals("("))
					stack.push(1);

				else if (strs[i].equals("["))
					stack.push(2);

				else if (strs[i].equals(")")) {
					try {
						if (stack.pop() == 2) {
							ans = "no";
							break;
						}

					} catch (Exception e) {
						ans = "no";
						break;
					}
				}

				else if (strs[i].equals("]")) {
					try {
						if (stack.pop() == 1) {
							ans = "no";
							break;
						}

					} catch (Exception e) {
						ans = "no";
						break;
					}
				}
			}
			
			if (!stack.empty())
				ans = "no";

			bw.write(ans + "\n");

		}

		bw.flush();
		bw.close();
		br.close();
	}
}
