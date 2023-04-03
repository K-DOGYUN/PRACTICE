package baekjoon.step08.basicMath;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class No2745 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");

		String N = st.nextToken();
		int B = Integer.parseInt(st.nextToken());

		Map<String, Integer> alphabet = new HashMap<>();

		for (int i = 10; i <= 35; i++) {
			String alpha = Character.toString(55+i);
			alphabet.put(alpha, i);
		}
		
		String[] num = N.split("");
		int ans = 0;
		
		for (int i = 0; i < num.length; i++) {
			if(alphabet.containsKey(num[num.length-i-1])) 
				ans += alphabet.get(num[num.length-i-1])*((int) Math.pow(B, i));
			else
				ans += Integer.parseInt(num[num.length-i-1])*((int) Math.pow(B, i));
				
		}
		
		System.out.println(ans);
		
		sc.close();
	}
}
