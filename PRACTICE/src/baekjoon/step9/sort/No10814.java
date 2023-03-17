package baekjoon.step9.sort;

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

public class No10814 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		Map<Integer, List<String>> members = new HashMap<>();

		for (int i = 0; i < N; i++) {
			String[] str = br.readLine().split(" ");
			int age = Integer.parseInt(str[0]);

			if (members.get(age) != null)
				members.get(age).add(str[1]);

			else {
				members.put(age, new ArrayList<>());
				members.get(age).add(str[1]);
			}
		}

		Iterator<Integer> it = members.keySet().iterator();
		List<Integer> ages = new ArrayList<>();

		while (it.hasNext())
			ages.add(it.next());

		ages.sort(null);

		for (int i = 0; i < ages.size(); i++) {
			List<String> names = members.get(ages.get(i));

			for (int j = 0; j < names.size(); j++) {
				bw.write(Integer.toString(ages.get(i)) + " " + names.get(j));
				bw.newLine();
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
