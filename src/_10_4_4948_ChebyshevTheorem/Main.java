package _10_4_4948_ChebyshevTheorem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max, count, input;
		boolean[] primeNumber;
		while (true) {
			input = scan.nextInt();
			if (input == 0) {
				break;
			}
			max = input * 2;
			count = 0;
			primeNumber = new boolean[max + 1];
			primeNumber[0] = primeNumber[1] = true;
			for (int i = 2; i <= max; i++) {
				for (int j = i + i; j <= max; j += i) {
					primeNumber[j] = true;
				}
			}
			for (int i = input + 1; i <= max; i++) {
				if (!primeNumber[i]) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
