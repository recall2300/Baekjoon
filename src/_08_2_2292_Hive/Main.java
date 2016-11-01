package _08_2_2292_Hive;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inputNumber;
		int i=1;
		inputNumber = scan.nextInt();
		while(true){
			if(((3*i*i)-(3*i)+1) < inputNumber){
				i++;
			}
			else{
				break;
			}
		}
		System.out.println(i);
	}
}