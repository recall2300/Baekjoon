package _06_02_2577_CountNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] numberCount = new int[10];
		int[] inputNumber = new int[3];
		int multiplyResult = 1;
		String result = null;
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<inputNumber.length;i++){
			inputNumber[i] = scan.nextInt();
			multiplyResult *= inputNumber[i];
		}
		result = String.valueOf(multiplyResult);
		
		for(int i=0; i<result.length();i++){
			numberCount[Character.getNumericValue(result.charAt(i))]++;
		}
		for(int i=0; i<numberCount.length;i++){
			System.out.println(numberCount[i]);
		}
	}
}