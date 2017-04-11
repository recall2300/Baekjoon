package _03_05_2439_PrintStar_2;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int inputValue;
        Scanner scan = new Scanner(System.in);
        
        inputValue = scan.nextInt();
        
        for(int i=0;i<inputValue;i++){
            for(int j=inputValue-i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}