package baekjoon.step49.setAndMap;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class No11478 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] alphabets = sc.nextLine().split("");
		Set<String> str = new HashSet<>();

		for (int i = 0; i < alphabets.length; i++) {
			String word = "";

			for (int j = i; j < alphabets.length; j++) {
				word += alphabets[j];
				str.add(word);
			}
		}

		System.out.println(str);
		System.out.println(str.size());

		sc.close();
	}
}
