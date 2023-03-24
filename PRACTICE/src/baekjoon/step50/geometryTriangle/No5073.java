package baekjoon.step50.geometryTriangle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No5073 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			if (0 == a)
				break;

			if (a >= b + c || b >= a + c || c >= b + a) {
				bw.write("Invalid");
				bw.newLine();
			}

			else if (a == b && b == c) {
				bw.write("Equilateral");
				bw.newLine();
			}

			else if (a == b || b == c || c == a) {
				bw.write("Isosceles");
				bw.newLine();
			}

			else {
				bw.write("Scalene");
				bw.newLine();
			}

		}

		bw.flush();
		bw.close();
		br.close();
	}
}
