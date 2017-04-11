package _2445_PrintStar_8;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < (n * 2) - 1; i++) {
			if (i < n) {
				for (int j = i + 1; j > 0; j--) {
					System.out.print("*");
				}
				for (int j = (n * 2) - ((i + 1) * 2); j > 0; j--) {
					System.out.print(" ");
				}
				for (int j = i + 1; j > 0; j--) {
					System.out.print("*");
				}
			} else {
				for (int j = n + (n - i); j > 1; j--) {
					System.out.print("*");
				}
				for (int j = (i - n + 1) * 2; j > 0; j--) {
					System.out.print(" ");
				}
				for (int j = n + (n - i); j > 1; j--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
