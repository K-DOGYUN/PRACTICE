package baekjoon.step12.queueDeque;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No2164 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		Queue<Integer> queue = new LinkedList<Integer>();

		for (int i = 1; i <= N; i++)
			queue.add(i);

		while (true) {
			if (queue.size() == 1)
				break;

			queue.poll();
			queue.add(queue.poll());
		}

		System.out.println(queue.poll());
		sc.close();
	}
}
