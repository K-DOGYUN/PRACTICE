package baekjoon.step52.intensification1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No25206 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = "";
		double sum = 0.0;
		double cnt = 0.0;

		while ((input = br.readLine()) != null && !input.equals("")) {
			String[] grade = input.split(" ");
			switch (grade[2]) {
			case "A+":
				sum += 4.5 * Double.parseDouble(grade[1]);
				cnt += Double.parseDouble(grade[1]);
				break;
			case "A0":
				sum += 4.0 * Double.parseDouble(grade[1]);
				cnt += Double.parseDouble(grade[1]);
				break;
			case "B+":
				sum += 3.5 * Double.parseDouble(grade[1]);
				cnt += Double.parseDouble(grade[1]);
				break;
			case "B0":
				sum += 3.0 * Double.parseDouble(grade[1]);
				cnt += Double.parseDouble(grade[1]);
				break;
			case "C+":
				sum += 2.5 * Double.parseDouble(grade[1]);
				cnt += Double.parseDouble(grade[1]);
				break;
			case "C0":
				sum += 2.0 * Double.parseDouble(grade[1]);
				cnt += Double.parseDouble(grade[1]);
				break;
			case "D+":
				sum += 1.5 * Double.parseDouble(grade[1]);
				cnt += Double.parseDouble(grade[1]);
				break;
			case "D0":
				sum += 1.0 * Double.parseDouble(grade[1]);
				cnt += Double.parseDouble(grade[1]);
				break;
			case "F":
				sum += 0.0 * Double.parseDouble(grade[1]);
				cnt += Double.parseDouble(grade[1]);
				break;

			default:
				break;
			}
		}

		double avg = sum/cnt;
		
		System.out.println(String.format("%.6f", avg));
		br.close();
	}
}
