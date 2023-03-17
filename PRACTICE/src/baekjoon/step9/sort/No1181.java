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

public class No1181 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		Map<Integer, List<String>> words = new HashMap<>();
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			int len = str.length();
			
			if(words.get(len) != null) {
				if(!words.get(len).contains(str))
					words.get(len).add(str);
			}
			
			else {
				words.put(len, new ArrayList<>());
				words.get(len).add(str);
			}
		}
		
		Iterator<Integer> it = words.keySet().iterator();
		List<Integer> lens = new ArrayList<>();

		while (it.hasNext())
			lens.add(it.next());

		lens.sort(null);

		for (int i = 0; i < lens.size(); i++) {
			List<String> sameLenWords = words.get(lens.get(i));

			sameLenWords.sort(null);

			for (int j = 0; j < sameLenWords.size(); j++) {
				bw.write(sameLenWords.get(j));
				bw.newLine();
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
