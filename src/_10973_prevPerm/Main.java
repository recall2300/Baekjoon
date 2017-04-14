package _10973_prevPerm;

import java.util.Scanner;

public class Main {
	static void perm(int[] array, int depth, int n, int k) {
		if (depth == k) {
			print(array, k);
			return;
		}
		for (int i = depth; i < n; i++) {
			swap(array, i, depth);
			perm(array, depth+1, n, k);
			swap(array, i, depth);
		}
	}
	static void swap(int[] array, int i, int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}
	static void print(int[] array, int k){
		for (int i=0;i<k;i++){
			if (i==k-1){
				System.out.println(array[i]);
			}
			else{
				System.out.print(array[i]+",");
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] array = new int[N];
		for(int i=0;i<N;i++){
			array[i] = (i+1);
		}
		perm(array,0,4,4);
	}

}
