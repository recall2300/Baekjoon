package _2522_PrintStar_12;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 1; i <= (2*n)-1; i++) {
			for (int j = Math.abs(n - i); j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = n-Math.abs(n - i); j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
