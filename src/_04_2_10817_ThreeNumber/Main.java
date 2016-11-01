package _04_2_10817_ThreeNumber;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int x,y,z;
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        y = scan.nextInt();
        z = scan.nextInt();
        
        if(x-y>0) {
            if(x-z>0) {
                if(y-z>0) {
                    System.out.print(y);
                }
                else{
                    System.out.print(z);
                }
            }
            else{
                System.out.print(x);
            }
        }
        else {
            if(x-z>0) {
                System.out.print(x);
            }
            else{
                if(y-z>0) {
                    System.out.print(z);
                }
                else{
                    System.out.print(y);
                }
            }
        }
    }
}