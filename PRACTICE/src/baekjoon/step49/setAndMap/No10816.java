package baekjoon.step49.setAndMap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class No10816 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		Map<Integer, Integer> hands = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());

			if (hands.containsKey(num))
				hands.put(num, hands.get(num) + 1);
			else
				hands.put(num, 1);
		}

		int M = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < M; i++) {
			int num = Integer.parseInt(st.nextToken());

			if (hands.containsKey(num))
				bw.write(Integer.toString(hands.get(num)) + " ");
			else
				bw.write("0 ");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
