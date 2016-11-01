package _08_3_1193_FindFractionalNumber;

import java.util.Scanner;

public class Main {
	public static int getValue(int inputNumber, int numeOrDeno){
		int i = 1;
		int count = 0;
		int resultValue = 0;
		while(count != inputNumber){
			if(i%2 == numeOrDeno){
				for(int j=1;j<=i;j++){
					count++;
					resultValue = j;
					if(count == inputNumber){
						break;
					}
				}
			}
			else{
				for(int j=i;j>=1;j--){
					count++;
					resultValue = j;
					if(count == inputNumber){
						break;
					}
				}
			}
			i++;
		}
		return resultValue;
	}
	public static void main(String[] args) {
		// 1 2 3 4 5 ..n(n+1)/2
		// 1/1 2/3 2 1/1 2 3 4/5 4 3 2 1
		// 1/2 1/1 2 3/4 3 2 1/1 2 3 4 5
		Scanner scan = new Scanner(System.in);
		int inputNumber = scan.nextInt();
		int numerator = getValue(inputNumber, 0);
		int denominator = getValue(inputNumber, 1);
		
		System.out.println(numerator+"/"+denominator);
	}
}
