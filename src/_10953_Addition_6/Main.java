package _10953_Addition_6;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < testcase; i++) {
			String input = scan.nextLine();
			String[] splitString = input.split(",");
			int k = Integer.parseInt(splitString[0]) + Integer.parseInt(splitString[1]);
			System.out.println(k);
		}
	}
}
