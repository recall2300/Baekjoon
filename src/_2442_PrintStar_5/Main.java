package _2442_PrintStar_5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int line = scan.nextInt();
		for (int i = 0; i < line; i++) {
			for (int j = line - (i + 1); j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = (2 * (i + 1)) - 1; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
