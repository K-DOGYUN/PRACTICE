package baekjoon.step10.factorMultiplePrime;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No5086 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			String[] input = br.readLine().split(" ");

			if ("0".equals(input[0]) && "0".equals(input[1]))
				break;

			int lft = Integer.parseInt(input[0]);
			int rgt = Integer.parseInt(input[1]);

			if (rgt % lft == 0)
				bw.write("factor");
			else if (lft % rgt == 0)
				bw.write("multiple");
			else
				bw.write("neither");
			
			bw.newLine();
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
