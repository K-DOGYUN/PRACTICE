package baekjoon.step11.stackQueDeq;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class No12789 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		
		String[] students = sc.nextLine().split(" ");
		
		int[] seq = new int[N];
		
		for (int i = 0; i < N; i++) {
			seq[i] = Integer.parseInt(students[i]);
		}
		
		int now = 1;
		boolean flag = true;
		Stack<Integer> stack = new Stack<>();
		
		int i = 0;
		
		while (i < N) {
			if (now == seq[i]) {
				now++;
				flag = true;
				i++;
			} else if (!stack.isEmpty() && stack.peek() == now) {
				now++;
				stack.pop();
			} else {
				stack.add(seq[i]);
				flag = false;
				i++;
			}
		}
		
		while (!stack.isEmpty()) {
			if (stack.pop() != now++) {
				flag = false;
				break;
			}
		}
		
		System.out.println(flag ? "Nice" : "Sad");
		
		sc.close();
	}
}
