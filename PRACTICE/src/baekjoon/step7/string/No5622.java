package baekjoon.step7.string;

import java.io.IOException;

public class No5622 {
	public static void main(String[] args) throws IOException {
		int value;
		int count = 0;

		while (true) {
			value = System.in.read();
			if (value == '\n')// \n
				break;
			if (value > 64) {
				if (value < 68)// ABC
					count += 3;
				else if (value < 71)// DEF
					count += 4;
				else if (value < 74)// GHI
					count += 5;
				else if (value < 77)// IKL
					count += 6;
				else if (value < 80)// MNO
					count += 7;
				else if (value < 84)// PQRS
					count += 8;
				else if (value < 87)// TUV
					count += 9;
				else if (value < 91)// WXYZ
					count += 10;
			}
		}
		System.out.println(count);
	}
}
