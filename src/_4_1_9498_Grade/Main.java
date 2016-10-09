package _4_1_9498_Grade;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int inputValue;
        Scanner scan = new Scanner(System.in);
        inputValue = scan.nextInt();
        
        if(inputValue>=90){
            System.out.print("A");
        }
        else if(inputValue>=80){
            System.out.print("B");
        }
        else if(inputValue>=70){
            System.out.print("C");
        }
        else if(inputValue>=60){
            System.out.print("D");
        }
        else{
            System.out.print("F");
        }
    }
}