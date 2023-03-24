package baekjoon.step50.geometryTriangle;

import java.util.Scanner;

public class No10101 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (180 == a + b + c) {
			if (a == b && b == c)
				System.out.println("Equilateral");

			else if (a == b || b == c || c == a)
				System.out.println("Isosceles");

			else
				System.out.println("Scalene");
		}

		else
			System.out.println("Error");
		
		sc.close();
	}
}
