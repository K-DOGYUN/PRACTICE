package baekjoon;

import java.io.IOException;

public class No2941 {
	public static void main(String[] args) throws IOException {
		int count = 0;
		int first = 0, second = 0;
		int value = 0;

		while (true) {
			first = second;
			second = value;
			value = System.in.read();

			if (value == 10)
				break;

			if (value > 32 && value != 61 && value != 45 && value != 106) {
				count++; //System.out.println("a");
			} else if (value == 61 && first == 100 && second == 122) {
				count--; //System.out.println("b");
			} else if (value == 106 && second != 108 && second != 110) {
				count++; //System.out.println("c");
			}
		}
		//System.out.println(first);
		//System.out.println(second);
		//System.out.println(value);
		System.out.println(count);
	}
}
//173, 157, 296, 158, 227, 229, 189, 196