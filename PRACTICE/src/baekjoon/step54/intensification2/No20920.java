package baekjoon.step54.intensification2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class No20920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			if (str.length() >= M) {
				if (!map.containsKey(str))
					map.put(str, 1);
				else
					map.put(str, map.get(str) + 1);
			}
		}

		List<String> words = map.keySet().stream().collect(Collectors.toList());

		words.sort((o1, o2) -> {
			if (map.get(o1) != map.get(o2))
				return map.get(o2) - map.get(o1);
			else {
				if (o1.length() != o2.length())
					return o2.length() - o1.length();
				else
					return o1.compareTo(o2);
			}
		});

		for (String word : words) {
			bw.write(word);
			bw.newLine();
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
