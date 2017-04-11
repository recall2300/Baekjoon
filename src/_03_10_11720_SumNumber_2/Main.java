package _03_10_11720_SumNumber_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int countNumber = scan.nextInt();
		scan.nextLine();
		String number = scan.nextLine();
		int total=0;
		
		for(int i=0;i<number.length();i++){
			total += (int)number.charAt(i)-48;
		}
		System.out.println(total);
	}
}
