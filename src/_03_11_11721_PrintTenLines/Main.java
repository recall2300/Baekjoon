package _03_11_11721_PrintTenLines;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int inputLength = input.length();
		int count = inputLength / 10;
		int k = 0;
		if (inputLength % 10 != 0) {
			count++;
		}
		for (int i = 0; i < count; i++) {
			if (k + 10 < input.length()) {
				System.out.println(input.substring(k, k + 10));
			} else {
				System.out.println(input.substring(k, input.length()));
			}
			k += 10;
		}
	}
}
