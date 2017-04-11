package _07_04_1157_StudyWord;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine().toLowerCase();
		int[] count = new int[26];
		int[] count2;
		int max = -1;
		int maxIndex = -1;
		for (int i = 0; i < input.length(); i++) {
			count[(int) input.charAt(i) - 97]++;
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] > max) {
				max = count[i];
				maxIndex = i;
			}
		}
		count2 = count.clone();
		Arrays.sort(count);
		if (count[25] == count[24]) {
			System.out.println("?");
		} else {
			System.out.println((char)(maxIndex+65));
		}
	}
}
