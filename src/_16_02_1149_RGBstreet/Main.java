package _16_02_1149_RGBstreet;

import java.util.Scanner;

public class Main {
	static int R = 0;
	static int G = 1;
	static int B = 2;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();
		int[][] dp = new int[3][testcase];
		
		dp[R][0] = scan.nextInt();
		dp[G][0] = scan.nextInt();
		dp[B][0] = scan.nextInt();
		
		for(int i=1;i<testcase;i++){
			int red = scan.nextInt();
			int green = scan.nextInt();
			int blue = scan.nextInt();
			
			dp[R][i] = red + Math.min(dp[G][i-1], dp[B][i-1]);
			dp[G][i] = green + Math.min(dp[R][i-1], dp[B][i-1]);
			dp[B][i] = blue + Math.min(dp[R][i-1], dp[G][i-1]);
		}
		int result = Math.min(Math.min(dp[R][testcase-1],dp[G][testcase-1]), dp[B][testcase-1]);
		
		System.out.println(result);

	}
}
