package _7_3_2675_RepeatString;

import java.util.Scanner;

public class Main {

	public static String getRepeatString(String plainString){
		String[] splitString = null;
		String resultString = "";
		splitString = plainString.split(" ");
		for(int i=0; i<splitString[1].length();i++){
			for(int j=0;j<Integer.parseInt(splitString[0]);j++){
				resultString += splitString[1].charAt(i);
			}
		}
		return resultString;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int totalTestCase = Integer.parseInt(scan.nextLine());
		String[] inputCase = new String[totalTestCase];
		for(int i=0;i<totalTestCase;i++){
			inputCase[i] = scan.nextLine();
		}
		for(int i=0;i<totalTestCase;i++){
			System.out.println(getRepeatString(inputCase[i]));
		}
	}
}