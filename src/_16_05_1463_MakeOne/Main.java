package _16_05_1463_MakeOne;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int[] dp = new int[1000001];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
		for (int i = 4; i <= input; i++) {
			if (i % 3 == 0) {
				dp[i] = Math.min(dp[i/3]+1, dp[i]);
			}
			if (i % 2 == 0) {
				dp[i] = Math.min(dp[i/2]+1, dp[i]);
			}
			dp[i] = Math.min(dp[i-1]+1, dp[i]);
		}
		System.out.println(dp[input]);
	}
}
