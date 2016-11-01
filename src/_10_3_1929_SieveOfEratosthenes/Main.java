package _10_3_1929_SieveOfEratosthenes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int maxValue = Math.max(M, N);
		int minValue = Math.min(M, N);
		boolean[] primeNumber = new boolean[maxValue + 1];

		for (int i = 2; i <= maxValue; i++) {
			for (int j = i + i; j <= maxValue; j += i) {
				primeNumber[j] = true;
			}
		}
		primeNumber[0] = true;
		primeNumber[1] = true;

		for (int i = minValue; i <= maxValue; i++) {
			if (!primeNumber[i]) {
				System.out.println(i);
			}
		}
	}
}