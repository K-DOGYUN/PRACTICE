package baekjoon.step12.queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class No18258 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		Deque<Integer> queue = new LinkedList<>();

		while (N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String command = st.nextToken();

			switch (command) {
			case "push":
				queue.add(Integer.parseInt(st.nextToken()));
				break;

			case "pop":
				bw.write((queue.isEmpty()) ? "-1\n" : queue.poll() + "\n");
				break;

			case "size":
				bw.write(queue.size() + "\n");
				break;

			case "empty":
				bw.write((queue.isEmpty()) ? "1\n" : "0\n");
				break;

			case "front":
				bw.write((queue.isEmpty()) ? "-1\n" : queue.peek() + "\n");
				break;

			case "back":
				bw.write((queue.isEmpty()) ? "-1\n" : queue.peekLast() + "\n");
				break;

			default:
				break;
			}
		}

		bw.close();
		br.close();
	}

}
