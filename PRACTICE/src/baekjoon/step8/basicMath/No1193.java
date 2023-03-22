package baekjoon.step8.basicMath;

import java.util.Scanner;

public class No1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = Integer.parseInt(sc.nextLine());
		int i = 1, count = 1;

		while (X > i) {
			count++;
			i += count;
			//System.out.println(X + "/" + i + "/" + count);
		}
		int fraction = X - i + count;
		if (count % 2 == 0)
			System.out.println(fraction + "/" + (count - fraction + 1));
		else
			System.out.println((count - fraction + 1) + "/" + fraction);
		sc.close();
	}
}
