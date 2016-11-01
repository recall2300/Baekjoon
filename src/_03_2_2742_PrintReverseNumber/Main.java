package _03_2_2742_PrintReverseNumber;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int inputValue;
        Scanner scan = new Scanner(System.in);
        
        inputValue = scan.nextInt();
        for(int i=0;i<inputValue;i++){
            System.out.println(inputValue-i);
        }
    }
}