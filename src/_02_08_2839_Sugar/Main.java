package _02_08_2839_Sugar;

import java.util.Scanner;

public class Main {
	static int totalBag(int n) {
		int maxFiveBag = n / 5;
		int maxThreeBag = n / 3;
		for (int i = 0; i <= maxThreeBag; i++) {
			for (int j = 0; j <= maxFiveBag; j++) {
				if (3 * i + 5 * j == n) {
					return i + j;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		if (input >= 3 && input <= 5000) {
			System.out.println(totalBag(input));
		}
	}
}
