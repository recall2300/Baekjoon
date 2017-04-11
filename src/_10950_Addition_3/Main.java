package _10950_Addition_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();
		int[][] caseArray = new int[testcase][];
		for (int i = 0; i < testcase; i++) {
			caseArray[i] = new int[2];
			for (int j = 0; j < 2; j++) {
				caseArray[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i < testcase; i++) {
			System.out.println(caseArray[i][0] + caseArray[i][1]);
		}
	}
}
