package baekjoon.step49.setAndMap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class No1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Set<String> neverHeard = new HashSet<>();
		
		for (int i = 0; i < N; i++) {
			neverHeard.add(br.readLine());
		}
		
		List<String> neverSeen = new ArrayList<>();
		
		for (int i = 0; i < M; i++) {
			String input = br.readLine();
			
			if(neverHeard.contains(input))
				neverSeen.add(input);
		}
		
		neverSeen.sort(null);
		
		bw.write(Integer.toString(neverSeen.size()));
		bw.newLine();
		
		for(String str : neverSeen) {
			bw.write(str);
			bw.newLine();
		}

		
		bw.flush();
		bw.close();
		br.close();
	}
}
