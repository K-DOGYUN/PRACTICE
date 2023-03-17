package baekjoon.step1.arithmetic;

import java.math.BigDecimal;
import java.util.Scanner;

public class No11382 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] ABC = sc.nextLine().split(" ");

		BigDecimal A = new BigDecimal(ABC[0]);
		BigDecimal B = new BigDecimal(ABC[1]);
		BigDecimal C = new BigDecimal(ABC[2]);

		A = A.add(B);
		A = A.add(C);

		System.out.println(A);
		sc.close();
	}
}
