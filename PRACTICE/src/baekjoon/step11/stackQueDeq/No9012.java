package baekjoon.step11.stackQueDeq;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class No9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			String[] parenthesis = new String[str.length()];
			parenthesis = str.split("");

			Stack<Integer> stack = new Stack<>();
			String ans = "YES";

			for (int j = 0; j < parenthesis.length; j++) {
				if (parenthesis[j].equals("("))
					stack.push(1);
				else {
					try {
						stack.pop();
					} catch (Exception e) {
						ans = "NO";
					}
				}
			}
			if (!stack.empty())
				ans = "NO";
			
			bw.write(ans + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
