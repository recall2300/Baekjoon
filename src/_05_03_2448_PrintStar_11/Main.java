package _05_03_2448_PrintStar_11;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static char[][] starArray;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		starArray = new char[n][n * 2];
		for (int i = 0; i < n; i++) {
			Arrays.fill(starArray[i], ' ');
		}
		drawStar(n, 0, n - 1);
		for (int i = 0; i < n; i++) {
			System.out.println(starArray[i]);
		}
	}

	static void drawStar(int n, int x, int y) {
		if (n == 3) {
			starArray[x][y] = '*';
			starArray[x + 1][y + 1] = '*';
			starArray[x + 1][y - 1] = '*';
			starArray[x + 2][y] = '*';
			starArray[x + 2][y + 1] = '*';
			starArray[x + 2][y + 2] = '*';
			starArray[x + 2][y - 1] = '*';
			starArray[x + 2][y - 2] = '*';
			return;
		}

		int modValue = n / 2;
		drawStar(modValue, x, y);
		drawStar(modValue, x + modValue, y + modValue);
		drawStar(modValue, x + modValue, y - modValue);
	}
}