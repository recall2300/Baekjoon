package _05_2_1065_HanNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int inputValue, count=0;
		Scanner scan = new Scanner(System.in);
		inputValue = scan.nextInt();
        //1���ڸ��� 10���ڸ��� ��� �Ѽ��̱� �����̴�.
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