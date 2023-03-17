package baekjoon.step49.setAndMap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class No1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		Map<String, Integer> dctnry = new HashMap<>();
		String[] names = new String[N];

		for (int i = 0; i < N; i++) {
			String name = br.readLine();

			dctnry.put(name, i);
			names[i] = name;
		}

		for (int i = 0; i < M; i++) {
			String input = br.readLine();

			try {
				int num = Integer.parseInt(input);
				bw.write(names[num - 1]);
				bw.newLine();
			} catch (Exception e) {
				bw.write(Integer.toString(dctnry.get(input) + 1));
				bw.newLine();
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
