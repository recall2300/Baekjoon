package _07_02_10809_FindAlphabet;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputWord;
		int[] number = new int[26];
		Arrays.fill(number, -1);
		inputWord = scan.nextLine();
		for(int i=0;i<inputWord.length();i++){
			if(number[inputWord.charAt(i)-97] == -1) {
				number[inputWord.charAt(i)-97] = i;
			}
		}
		int[] test = new int[3];
		for(int i=0;i<number.length;i++){
			System.out.print(number[i]+" ");
		}
	}
}
