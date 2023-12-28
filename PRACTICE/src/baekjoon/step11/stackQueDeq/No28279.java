package baekjoon.step11.stackQueDeq;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class No28279 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		Deque<String> deque = new LinkedList<>();

		for (int i = 0; i < N; i++) {
			String[] order = br.readLine().split(" ");
			
			switch (order[0]) {
				case "1":
					deque.addFirst(order[1]);
					break;
				case "2":
					deque.addLast(order[1]);
					break;
				case "3":
					bw.write(deque.isEmpty() ? "-1" : deque.pollFirst());
					bw.newLine();
					break;
				case "4":
					bw.write(deque.isEmpty() ? "-1" : deque.pollLast());
					bw.newLine();
					break;
				case "5":
					bw.write(Integer.toString(deque.size()));
					bw.newLine();
					break;
				case "6":
					bw.write(deque.isEmpty() ? "1" : "0");
					bw.newLine();
					break;
				case "7":
					bw.write(deque.isEmpty() ? "-1" : deque.peekFirst());
					bw.newLine();
					break;
				case "8":
					bw.write(deque.isEmpty() ? "-1" : deque.peekLast());
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
