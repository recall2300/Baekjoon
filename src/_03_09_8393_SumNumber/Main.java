package _03_09_8393_SumNumber;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int inputValue;
        int total = 0;
        Scanner scan = new Scanner(System.in);
        inputValue = scan.nextInt();
        for(int i=1;i<=inputValue;i++){
            total += i;
        }
        System.out.println(total);
    }
}