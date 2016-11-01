package _02_2_1001_Subtraction;

import java.util.*;

public class Main{
    public static void main(String[] args){
        int userInput1, userInput2;
        Scanner scan = new Scanner(System.in);
        
        userInput1 = scan.nextInt();
        userInput2 = scan.nextInt();

        System.out.println(userInput1 - userInput2);
    }
}