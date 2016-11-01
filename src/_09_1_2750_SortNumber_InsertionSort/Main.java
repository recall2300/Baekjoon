package _09_1_2750_SortNumber_InsertionSort;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inputNumber = scan.nextInt();
		int[] numberList = new int[inputNumber];
		
		for(int i=0;i<inputNumber;i++){
			numberList[i] = scan.nextInt();
		}
		
		for(int i=0;i<inputNumber;i++){
			for(int j=i;j>0;j--){
				if(numberList[j]<numberList[j-1]){
					int temp = numberList[j];
					numberList[j] = numberList[j-1];
					numberList[j-1] = temp;
				}
			}
		}
		for (int i=0;i<inputNumber;i++){
			System.out.println(numberList[i]);
		}
	}

}
