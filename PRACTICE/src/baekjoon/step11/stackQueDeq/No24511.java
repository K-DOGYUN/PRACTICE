package baekjoon.step11.stackQueDeq;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class No24511 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		String[] structure = br.readLine().split(" ");
		String[] vals = br.readLine().split(" ");
		
		Deque<String> deq = new ArrayDeque<>();
		
		for (int i = 0; i < N; i++) {
			if (structure[i].equals("0"))
				deq.add(vals[i]);
		}
		
		int M = Integer.parseInt(br.readLine());
		String[] inputs = br.readLine().split(" ");
		
		for (int i = 0; i < M; i++) {
			deq.addFirst(inputs[i]);
			bw.write(deq.pollLast() + " ");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
