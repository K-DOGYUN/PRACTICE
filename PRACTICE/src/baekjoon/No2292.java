package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class No2292 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.nextLine());
		int i = 1;
		int count = 1;

		while (N > i) {
			i += 6 * count;
			count++;
		}
		System.out.println(count);
		sc.close();
	}
}