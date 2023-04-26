package baekjoon.step12.queueDeque;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No11866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		Queue<Integer> queue = new LinkedList<>();
		
		for (int i = 1; i <= N; i++)
			queue.add(i);

		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		while (true) {
			if (queue.size() == 1)
				break;
			
			int cnt = K;
			
			while (cnt-->1) {
				queue.add(queue.poll());
			}
			sb.append(queue.poll()).append(", ");
		}
		
		sb.append(queue.poll()).append(">");
		
		System.out.println(sb);
		sc.close();
	}
}
