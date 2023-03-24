package baekjoon.step50.geometryTriangle;

import java.util.Scanner;

public class No1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();

		int minX = Integer.MAX_VALUE;
		int minY = Integer.MAX_VALUE;

		if (x > w - x)
			minX = w - x;
		else
			minX = x;

		if (y > h - y)
			minY = h - y;
		else
			minY = y;

		if (minX > minY)
			System.out.println(minY);
		else
			System.out.println(minX);
		
		sc.close();
	}

}
