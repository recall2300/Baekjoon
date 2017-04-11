package _04_05_4344_Average_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();
		float[] rankingArray = new float[testcase];
		int[][] gradeArray = new int[testcase][];
		for (int i = 0; i < testcase; i++) {
			int total = 0;
			float average = 0;
			int rowsize = scan.nextInt();
			int topCount = 0;
			gradeArray[i] = new int[rowsize];
			for (int j = 0; j < gradeArray[i].length; j++) {
				gradeArray[i][j] = scan.nextInt();
			}
			for (int j = 0; j < gradeArray[i].length; j++) {
				total += gradeArray[i][j];
			}
			average = total / gradeArray[i].length;
			for (int j = 0; j < gradeArray[i].length; j++) {
				if (average < gradeArray[i][j]) {
					topCount++;
				}
			}
			rankingArray[i] = (float) topCount / (float) gradeArray[i].length * 100;
		}

		for (int i = 0; i < testcase; i++) {
			System.out.printf("%.3f%%\n",rankingArray[i]);
		}

	}
}
