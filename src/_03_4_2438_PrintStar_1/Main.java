package _03_4_2438_PrintStar_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inputPrintLine;
		inputPrintLine = scan.nextInt();

		for (int i = 0; i < inputPrintLine; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
