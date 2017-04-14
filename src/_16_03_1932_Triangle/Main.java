package _16_03_1932_Triangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int totalFloor = scan.nextInt();
		int[][] list = new int[totalFloor][totalFloor];
		int max;
		list[0][0] = scan.nextInt();
		max = list[0][0];
		for (int i = 1; i < totalFloor; i++) {
			for(int j=0;j<=i;j++){
				list[i][j] = scan.nextInt();
			}
			for(int j=0;j<=i;j++){
				if(j==0){
					list[i][j] = list[i][j]+list[i-1][j];
				}else if(j==i){
					list[i][j] =list[i][j]+list[i-1][j-1]; 
				}else{
					list[i][j] = Math.max(list[i][j]+list[i-1][j-1], list[i][j]+list[i-1][j]);
				}	
			}
		}
		Arrays.sort(list[totalFloor-1]);
		max = list[totalFloor-1][totalFloor-1];
		System.out.println(max);
	}
}
