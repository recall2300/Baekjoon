package _3_3_2739_MultiplicationTable;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int inputValue;
        Scanner scan = new Scanner(System.in);
        inputValue = scan.nextInt();
        for(int j=1;j<=9;j++){
            System.out.println(inputValue+" * " +j+ " = " + inputValue*j);
        }
    }
}