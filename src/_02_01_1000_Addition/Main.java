package _02_01_1000_Addition;

import java.util.*;

public class Main{
    public static void main(String[] args){
        int userInput, totalValue=0;
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<2;i++){
            userInput = scan.nextInt();
            totalValue += userInput;
        }
        System.out.println(totalValue);
    }
}