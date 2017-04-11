package _11021_Addition_7;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();
		for (int i = 0; i < testcase; i++) {
			int input1 = scan.nextInt();
			int input2 = scan.nextInt();
			System.out.println("Case #" + (i + 1) + ": " + (input1 + input2));
		}
	}
}
