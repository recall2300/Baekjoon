package _10952_Addition_5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int input1 = scan.nextInt();
			int input2 = scan.nextInt();
			if (input1 == 0 && input2 == 0) {
				break;
			}
			System.out.println(input1 + input2);
		}
	}
}
