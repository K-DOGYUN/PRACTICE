package baekjoon.step11.stackQueDeq;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class No2346 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String[] orders = br.readLine().split(" ");
		
		Deque<Integer> balls = new ArrayDeque<>();
		Deque<Integer> notes = new ArrayDeque<>();
		
		for (int i = 0; i < N; i++) {
			balls.add(i + 1);
			notes.add(Integer.parseInt(orders[i]));
		}
		
		bw.write(balls.pollFirst() + " ");
		int move = notes.pollFirst();

		while (true) {
			if (balls.isEmpty()) break;
			
			if (move >= 0) {
				while (move-- != 0) {
					balls.addLast(balls.pollFirst());
					notes.addLast(notes.pollFirst());
				}
				
				bw.write(balls.pollLast() + " ");
				move = notes.pollLast();
			} else {
				while (move++ != 0) {
					balls.addFirst(balls.pollLast());
					notes.addFirst(notes.pollLast());
				}
				
				bw.write(balls.pollFirst() + " ");
				move = notes.pollFirst();
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
