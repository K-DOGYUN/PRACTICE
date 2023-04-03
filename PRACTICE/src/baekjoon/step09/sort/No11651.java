package baekjoon.step09.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class No11651 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		Map<Integer, List<Integer>> coord = new HashMap<>();

		for (int i = 0; i < N; i++) {
			String[] str = br.readLine().split(" ");

			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[1]);

			if (coord.get(y) != null)
				coord.get(y).add(x);

			else {
				coord.put(y, new ArrayList<>());
				coord.get(y).add(x);
			}
		}

		Iterator<Integer> it = coord.keySet().iterator();
		List<Integer> arrY = new ArrayList<>();

		while (it.hasNext())
			arrY.add(it.next());

		arrY.sort(null);

		for (int i = 0; i < arrY.size(); i++) {
			List<Integer> arrX = coord.get(arrY.get(i));

			arrX.sort(null);

			for (int j = 0; j < arrX.size(); j++) {
				bw.write(Integer.toString(arrX.get(j)) + " " + Integer.toString(arrY.get(i)));
				bw.newLine();
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
