package _16_01_1003_Fibonacci;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();
		int[] values = new int[testcase];
		int[][] fibonacci = new int[2][41];
		for(int i=0;i<testcase;i++){
			values[i] = scan.nextInt();
		}
		fibonacci[0][0] = 1;
		fibonacci[1][1] = 1;
		for(int i=2;i<41;i++){
			fibonacci[0][i] = fibonacci[0][i-2] + fibonacci[0][i-1];
			fibonacci[1][i] = fibonacci[1][i-2] + fibonacci[1][i-1];
		}
		for(int i=0;i<testcase;i++){
			System.out.println(fibonacci[0][values[i]]+" "+fibonacci[1][values[i]]);
		}
	}
}
