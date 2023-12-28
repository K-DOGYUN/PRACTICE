package baekjoon.step11.stackQueDeq;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class No28278 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
			
			switch (Integer.parseInt(input[0])) {
				case 1:	
					stack.add(Integer.parseInt(input[1]));
					break;
				case 2:	
					bw.write(stack.empty() ? "-1" : Integer.toString(stack.pop()));
					bw.newLine();
					break;
				case 3: 
					bw.write(Integer.toString(stack.size()));
					bw.newLine();
					break;
				case 4: 
					bw.write(stack.empty() ? "1" : "0");
					bw.newLine();
					break;
				case 5: 
					bw.write(stack.empty() ? "-1" : Integer.toString(stack.peek()));
					bw.newLine();
					break;
				default:
					break;
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
