package _10992_PrintStar_17;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			if (i == 1) {
				System.out.print("*");
			} else if (i == n) {
				for (int j = (2 * n) - 1; j > 0; j--) {
					System.out.print("*");
				}
			} else {
				System.out.print("*");
				for (int j = ((n - Math.abs(n - i) - 1) * 2) - 1; j > 0; j--) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
