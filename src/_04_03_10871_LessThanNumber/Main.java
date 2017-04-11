package _04_03_10871_LessThanNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int integerSize, point;
        int[] inputInteger;
        Scanner scan = new Scanner(System.in);
        integerSize = scan.nextInt();
        point = scan.nextInt();
        
        inputInteger = new int[integerSize];
        for(int i=0; i<integerSize; i++ ){
        	inputInteger[i] = scan.nextInt();
        }
        
        for (int k : inputInteger){
        	if(k<point) {
        		System.out.print(k+" ");
        	}
        }

	}

}
