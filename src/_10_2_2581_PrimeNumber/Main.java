package _10_2_2581_PrimeNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int M = Integer.parseInt(br.readLine());
			int N = Integer.parseInt(br.readLine());
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

			int sumPrimeNumber = 0;
			int minPrimeNumber = Integer.MAX_VALUE;

			for (int i = minValue; i <= maxValue; i++) {
				if (!primeNumber[i]) {
					if (i < minPrimeNumber) {
						minPrimeNumber = i;
					}
					sumPrimeNumber += i;
				}
			}
			if (minPrimeNumber == Integer.MAX_VALUE) {
				System.out.println("-1");
			} else {
				System.out.println(sumPrimeNumber);
				System.out.println(minPrimeNumber);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
