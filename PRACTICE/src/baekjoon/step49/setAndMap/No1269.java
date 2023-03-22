package baekjoon.step49.setAndMap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class No1269 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		int cnt = 0;

		Set<Integer> set = new HashSet<>();

		st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < A; i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}

		st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < B; i++) {
			if (set.contains(Integer.parseInt(st.nextToken())))
				cnt++;
		}

		bw.write(Integer.toString(A + B - cnt * 2));
		bw.flush();
		bw.close();
		br.close();
	}
}
