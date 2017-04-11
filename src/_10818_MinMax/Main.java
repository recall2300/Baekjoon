package _10818_MinMax;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int values = scan.nextInt();
		int[] intArray = new int[values];
		for (int i = 0; i < values; i++) {
			intArray[i] = scan.nextInt();
		}
		Arrays.sort(intArray);
		System.out.println(intArray[0] + " " + intArray[intArray.length - 1]);
	}
}
