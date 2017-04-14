package _08_08_1475_RoomNumber;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.nextLine();
		String[] n = N.split("");
		int[] number = new int[10];
		for (int i = 0; i < N.length(); i++) {
			number[Integer.parseInt(n[i])]++;
		}
		int sum = number[6]+number[9];
		number[6] = number[9] = (int)Math.ceil((float)sum/2);
		Arrays.sort(number);
		System.out.println(number[number.length-1]);
	}

}
