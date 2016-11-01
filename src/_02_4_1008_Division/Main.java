package _02_4_1008_Division;

import java.util.*;

public class Main{
    public static void main(String[] args){
        double userInput1, userInput2;
        double result;
        Scanner scan = new Scanner(System.in);
        
        userInput1 = scan.nextDouble();
        userInput2 = scan.nextDouble();
        result = userInput1/userInput2;
        System.out.println(result);
    }
}