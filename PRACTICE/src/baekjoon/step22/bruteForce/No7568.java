package baekjoon.step22.bruteForce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class No7568 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		Map<Integer, List<Integer>> size = new HashMap<>();
		StringTokenizer st;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");

			size.put(i, new ArrayList<>());
			size.get(i).add(Integer.parseInt(st.nextToken()));
			size.get(i).add(Integer.parseInt(st.nextToken()));
		}

		for (int i = 0; i < N; i++) {
			int rank = 1;
			for (int j = 0; j < N; j++) {
				if (i == j)
					continue;

				if (size.get(i).get(0) < size.get(j).get(0) && size.get(i).get(1) < size.get(j).get(1))
					rank++;
			}
			bw.write(Integer.toString(rank) + " ");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
