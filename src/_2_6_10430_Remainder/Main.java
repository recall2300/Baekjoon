package _2_6_10430_Remainder;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        int userInput1, userInput2, userInput3;
        Scanner scan = new Scanner(System.in);
    
        userInput1 = scan.nextInt();
        userInput2 = scan.nextInt();
        userInput3 = scan.nextInt();
        System.out.println((userInput1+userInput2)%userInput3);
        System.out.println((userInput1%userInput3 + userInput2%userInput3)%userInput3);
        System.out.println((userInput1*userInput2)%userInput3);
        System.out.println((userInput1%userInput3 * userInput2%userInput3)%userInput3);
	}
}
