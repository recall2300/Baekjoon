package _9_2_2751_SortNumber_MergeSort;

import java.util.Scanner;

public class Main {
	static void merge(int[] numberList, int firstIndex, int midIndex, int lastIndex){
		
		int leftArrayFirstIndex = firstIndex;
		int leftArrayLastIndex = midIndex;
		int rightArrayFirstIndex = midIndex+1;
		int rightArrayLastIndex = lastIndex;
		
		if(numberList[leftArrayFirstIndex]>numberList[rightArrayFirstIndex]){
			leftArrayFirstIndex++;
		}
		
		System.out.println(firstIndex);
		System.out.println(midIndex);
		System.out.println(lastIndex);
		System.out.println("//");
		if(numberList[firstIndex]>numberList[lastIndex]){
			int swapTemp = numberList[firstIndex];
			numberList[firstIndex] = numberList[lastIndex];
			numberList[lastIndex] = swapTemp;
		}
	}
	static void mergeSort(int[] numberList, int firstIndex, int lastIndex){
		int midIndex;
		if(firstIndex<lastIndex){
			midIndex = (firstIndex+lastIndex)/2;
			mergeSort(numberList, firstIndex,midIndex);
			mergeSort(numberList, midIndex+1,lastIndex);
			merge(numberList, firstIndex, midIndex, lastIndex);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inputNumber = scan.nextInt();
		int[] numberList = new int[inputNumber];
		for(int i=0;i<inputNumber;i++){
			numberList[i] = scan.nextInt();
		}
		mergeSort(numberList, 0, inputNumber-1);
	}
}
