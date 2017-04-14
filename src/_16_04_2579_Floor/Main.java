package _16_04_2579_Floor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int floor = scan.nextInt();
		int[] inputList = new int[floor];
		int[] dp = new int[floor];
		for (int i = 0; i < floor; i++) {
			inputList[i] = scan.nextInt();
		}
		dp[0] = inputList[0];

		dp[1] = Math.max(dp[0] + inputList[1], inputList[1]);
		dp[2] = Math.max(dp[0] + inputList[2], inputList[1] + inputList[2]);
		for (int i = 3; i < floor; i++) {
			dp[i] = Math.max(dp[i - 2] + inputList[i], dp[i - 3] + inputList[i - 1] + inputList[i]);
		}
		System.out.println(dp[floor-1]);
	}
}
