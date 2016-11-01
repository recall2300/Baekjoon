package _05_2_1065_HanNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int inputValue, count=0;
		Scanner scan = new Scanner(System.in);
		inputValue = scan.nextInt();
        //1의자리와 10의자리는 모두 한수이기 때문이다.
		if(inputValue<100){
			count = inputValue;
		}
		else{
			count += 99;
			for (int i=100;i<=inputValue;i++){
				if(i%10-i/10%10 == i/10%10-i/100){
					count++;
				}
			}
		}
		System.out.println(count);
		
	}
}