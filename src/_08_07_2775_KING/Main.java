package _08_07_2775_KING;

import java.util.Scanner;

public class Main {
	static int sum(int[] apartment, int n) {
		int result = 0;
		for (int i = 0; i <= n; i++) {
			result += apartment[i];
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int k = 0, n = 0;
		int[][] apartment = null;
		for (int t = 0; t < T; t++) {
			k = scan.nextInt();
			n = scan.nextInt();

			apartment = new int[k + 1][n + 1];

			for (int i = 0; i <= n; i++) {
				apartment[0][i] = i;
			}

			for (int i = 1; i <= k; i++) {
				for (int j = 0; j <= n; j++) {
					apartment[i][j] = sum(apartment[i - 1], j);
				}
			}
			System.out.println(apartment[k][n]);
		}
		
	}

}
