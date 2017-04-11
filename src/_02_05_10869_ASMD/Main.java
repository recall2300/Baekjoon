package _02_05_10869_ASMD;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        int userInput1, userInput2;
        Scanner scan = new Scanner(System.in);
        
        userInput1 = scan.nextInt();
        userInput2 = scan.nextInt();
        System.out.println(userInput1+userInput2);
        System.out.println(userInput1-userInput2);
        System.out.println(userInput1*userInput2);
        System.out.println(userInput1/userInput2);
        System.out.println(userInput1%userInput2);
        
	}

}
