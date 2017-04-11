package _2446_PrintStar_9;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=1;i<=(n*2)-1;i++){
			for(int j=n-Math.abs(i-n);j>1;j--){
				System.out.print(" ");
			}
			for(int j=Math.abs(i-n)*2+1;j>0;j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}