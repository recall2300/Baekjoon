package _10991_PrintStar_16;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = Math.abs(n - i); j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = n - Math.abs(n - i); j > 0; j--) {
				if (j > 1) {
					System.out.print("*");
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}