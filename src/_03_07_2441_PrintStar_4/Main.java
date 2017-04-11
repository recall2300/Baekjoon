package _03_07_2441_PrintStar_4;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int userInput;
        Scanner scan = new Scanner(System.in);
        userInput = scan.nextInt();
        for(int i=0;i<userInput;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=userInput-i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}