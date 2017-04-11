package _06_05_10039_AverageGrade;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] grades = new int[5];
		int total = 0;
		for (int i = 0; i < 5; i++) {
			grades[i] = scan.nextInt();
			if(grades[i]<40){
				grades[i] = 40;
			}
			total += grades[i];
		}
		System.out.println(total/5);
	}
}
