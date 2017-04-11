package _03_01_2741_PrintNumber;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int inputValue;
        Scanner scan = new Scanner(System.in);
        
        inputValue = scan.nextInt();
        for(int i=1; i<=inputValue;i++){
            System.out.println(i);
        }
    }
}