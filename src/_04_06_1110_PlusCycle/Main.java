package _04_06_1110_PlusCycle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int result = input;
		int leftNumber, rightNumber, addNumber, resultNumber;
		int count = 0;
		do {
			count++;
			rightNumber = input % 10;
			leftNumber = input / 10;
			addNumber = leftNumber + rightNumber;
			resultNumber = (rightNumber * 10) + (addNumber % 10);
			input = resultNumber;
		} while (resultNumber != result);
		System.out.println(count);
	}
}