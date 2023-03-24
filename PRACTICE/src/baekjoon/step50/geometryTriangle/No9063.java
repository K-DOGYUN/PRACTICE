package baekjoon.step50.geometryTriangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No9063 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		StringTokenizer st;

		int minx = Integer.MAX_VALUE;
		int miny = Integer.MAX_VALUE;

		int maxx = Integer.MIN_VALUE;
		int maxy = Integer.MIN_VALUE;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			if (x < minx)
				minx = x;

			if (x > maxx)
				maxx = x;

			if (y < miny)
				miny = y;

			if (y > maxy)
				maxy = y;

		}

		System.out.println((maxx - minx) * (maxy - miny));

		br.close();
	}
}
