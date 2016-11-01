package _10_1_1978_FindPrimeNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		try {
			int[] numberList = null;
			int inputNumber = sc.nextInt();
			numberList = new int[inputNumber];
			for(int i =0;i<inputNumber;i++){
				numberList[i] = sc.nextInt();
			}
			int maxValue = Integer.MIN_VALUE;
			
			for(int i =0; i<numberList.length;i++){
				if(numberList[i] > maxValue){
					maxValue = numberList[i];
				}
			}
			boolean[] primeNumberList = new boolean[100+1];
			primeNumberList[0] = true;
			primeNumberList[1] = true;
			
			for(int i=2; i<=100;i++){
				for(int j=i+i;j<=100;j+=i){
					primeNumberList[j] = true;
				}
			}
			int primeNumberCount = 0;
			
			for(int i=0;i<numberList.length;i++){
				if(!primeNumberList[numberList[i]]){
					primeNumberCount++;
				}
			}
			System.out.println(primeNumberCount);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
