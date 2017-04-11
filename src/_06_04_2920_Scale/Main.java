package _06_04_2920_Scale;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String ascending = "12345678";
		String descending = "87654321";
		String scaleList = scan.nextLine();
		scaleList = scaleList.replaceAll(" ", "");
		if (ascending.compareTo(scaleList) == 0) {
			System.out.println("ascending");
		} else if (scaleList.compareTo(descending) == 0) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
	}
}
