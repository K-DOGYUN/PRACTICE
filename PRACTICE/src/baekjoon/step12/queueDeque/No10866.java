package baekjoon.step12.queueDeque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class No10866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		Deque<Integer> deque = new LinkedList<>();

		while (N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			switch (st.nextToken()) {
			case "push_front":
				deque.addFirst(Integer.parseInt(st.nextToken()));
				break;
			case "push_back":
				deque.addLast(Integer.parseInt(st.nextToken()));
				break;
			case "pop_front":
				sb.append((deque.peekFirst() == null) ? -1 + "\n" : deque.pollFirst() + "\n");
				break;
			case "pop_back":
				sb.append((deque.peekLast() == null) ? -1 + "\n" : deque.pollLast() + "\n");
				break;
			case "size":
				sb.append(deque.size() + "\n");
				break;
			case "empty":
				sb.append((deque.isEmpty()) ? 1 + "\n" : 0 + "\n");
				break;
			case "front":
				sb.append((deque.peekFirst() == null) ? -1 + "\n" : deque.peekFirst() + "\n");
				break;
			case "back":
				sb.append((deque.peekLast() == null) ? -1 + "\n" : deque.peekLast() + "\n");
				break;

			default:
				break;
			}
		}
		
		System.out.println(sb);
		br.close();
	}
}
