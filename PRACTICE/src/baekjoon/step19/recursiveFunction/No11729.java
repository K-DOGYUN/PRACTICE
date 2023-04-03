package baekjoon.step19.recursiveFunction;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class No11729 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		Hanoi hanoi = new Hanoi(N);

		hanoi.sorting(N);
		
		sc.close();
	}
}

class Hanoi {
	private Stack<Integer> h1 = new Stack<>();
	private Stack<Integer> h2 = new Stack<>();
	private Stack<Integer> h3 = new Stack<>();
	private int cnt;
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	Hanoi(int N) {
		for (int i = N; i > 0; i--) {
			h1.add(i);
			cnt = 0;
		}
	}

	private void sorting(int N, Stack<Integer> from, Stack<Integer> to, Stack<Integer> other) throws IOException {
		if (N > 1) {
			sorting(N - 1, from, other, to);
		}
		to.add(from.pop());
		
		cnt++;
		
		if (h1==from)
			bw.write("1 ");
		else if (h2==from)
			bw.write("2 ");
		else 
			bw.write("3 ");
		
		if (h1==to)
			bw.write("1\n");
		else if (h2==to)
			bw.write("2\n");
		else 
			bw.write("3\n");
		
		if (N > 1) {
			sorting(N - 1, other, to, from);
		}

	}

	public void sorting(int N) throws IOException {
		sorting(N, h1, h3, h2);
		System.out.println(cnt);
		bw.flush();
		bw.close();
	}
}