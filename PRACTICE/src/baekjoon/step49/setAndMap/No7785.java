package baekjoon.step49.setAndMap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class No7785 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		Map<String, String> member = new HashMap<>();
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
						
			member.put(st.nextToken(), st.nextToken());
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		List<String> names = new ArrayList<>();
		
		for(String key : member.keySet()) {
			if(member.get(key).equals("enter")) {
				names.add(key);
			}
		}
		
		names.sort(Collections.reverseOrder());;
		
		for(String name : names) {
			bw.write(name);
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
