package baekjoon.step22.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class No2798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");

		int[] nums = new int[N];

		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}

		List<Integer> sums = new ArrayList<Integer>();

		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i+1; j < nums.length - 1; j++) {
				for (int k = j+1; k < nums.length; k++) {
					int sum = nums[i] + nums[j] + nums[k];
					
					if(M >= sum)
						sums.add(sum);
				}
			}
		}
		
		sums.sort(null);
		
		System.out.println(sums.get(sums.size()-1));
	}
}
