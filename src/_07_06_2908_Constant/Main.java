package _07_06_2908_Constant;

import java.util.Scanner;

public class Main {
	static String reverse(String target) {
		StringBuilder sb = new StringBuilder(target);
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		int transA, transB;

		a = reverse(a);
		b = reverse(b);

		transA = Integer.parseInt(a);
		transB = Integer.parseInt(b);
		System.out.println(transA > transB ? transA : transB);

	}
}
