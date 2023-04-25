package baekjoon.step54.intensification2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class No26069 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		Map<String, Boolean> map = new HashMap<>();

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			String name1 = st.nextToken();
			if(!map.containsKey(name1)) {
				if (name1.equals("ChongChong"))
					map.put(name1, true);
				else
					map.put(name1, false);
			}

			String name2 = st.nextToken();
			if(!map.containsKey(name2)) {
				if (name2.equals("ChongChong"))
					map.put(name2, true);
				else
					map.put(name2, false);
			}

			boolean flag1 = map.get(name1);
			boolean flag2 = map.get(name2);

			if (flag1 || flag2) {
				map.put(name1, true);
				map.put(name2, true);
			} else {
				map.put(name1, false);
				map.put(name2, false);
			}
		}

		int ans = 0;

		for (String key : map.keySet()) {
			if (map.get(key))
				ans++;
		}

		System.out.println(ans);
		br.close();
	}
}
