package baekjoon.step19.recursiveFunction;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No25501 {
	public static String recursion(String s, int l, int r, int cnt) {
		cnt++;
		if (l >= r)
			return "1 " + Integer.toString(cnt);
		else if (s.charAt(l) != s.charAt(r))
			return "0 " + Integer.toString(cnt);
		else
			return recursion(s, l + 1, r - 1, cnt);
	}

	public static String isPalindrome(String s) {
		return recursion(s, 0, s.length() - 1, 0);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			bw.write(isPalindrome(br.readLine()));
			bw.newLine();
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
