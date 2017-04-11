package _07_05_GroupWordChecker;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inputCount = scan.nextInt();
		int groupWordCount = inputCount;
		scan.nextLine();
		String[] inputList = new String[inputCount];
		for (int i = 0; i < inputCount; i++) {
			inputList[i] = scan.nextLine();
		}
		for (int i = 0; i < inputCount; i++) {
			char before = 0;
			boolean[] checker = new boolean[26];
			for (int j = 0; j < inputList[i].length(); j++) {
				char newChar = inputList[i].charAt(j);
				if (j > 0) {
					before = inputList[i].charAt(j - 1);
				}
				if (before != newChar) {
					if (checker[newChar - 97] == false) {
						checker[newChar - 97] = true;
					} else {
						groupWordCount--;
						break;
					}
				}
			}
		}
		System.out.println(groupWordCount);
	}
}
