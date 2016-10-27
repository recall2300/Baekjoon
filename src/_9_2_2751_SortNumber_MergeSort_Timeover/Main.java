package _9_2_2751_SortNumber_MergeSort_Timeover;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	static int[] numberList = null;
	
	static void arraySwap(int[] tempArray, int firstIndex, int lastIndex){
		for(int i=0;i<tempArray.length;i++){
			numberList[firstIndex++] = tempArray[i];
		}
	}
	static void merge(int firstIndex, int midIndex, int lastIndex) {
		int tempArraySize = lastIndex-firstIndex+1;
		int[] tempArray = new int[tempArraySize];
		int count = 0;
		int leftArrayFirstIndex = firstIndex;
		int leftArrayLastIndex = midIndex;
		int rightArrayFirstIndex = midIndex + 1;
		int rightArrayLastIndex = lastIndex;

		while(count != tempArraySize){
			if (numberList[leftArrayFirstIndex] > numberList[rightArrayFirstIndex]) {
				tempArray[count++] = numberList[rightArrayFirstIndex++];
				if (rightArrayFirstIndex > rightArrayLastIndex) {
					while (leftArrayFirstIndex <= leftArrayLastIndex) {
						tempArray[count++] = numberList[leftArrayFirstIndex++];
					}
				}
			}
			else{
				tempArray[count++] = numberList[leftArrayFirstIndex++];
				if (leftArrayFirstIndex > leftArrayLastIndex) {
					while (rightArrayFirstIndex <= rightArrayLastIndex) {
						tempArray[count++] = numberList[rightArrayFirstIndex++];
					}
				}
			}
		}
		//replace numberList with tempArray
		//arraySwap(tempArray, firstIndex, lastIndex);
		for(int i=0;i<tempArray.length;i++){
			numberList[firstIndex++] = tempArray[i];
		}

	}

	static void mergeSort(int firstIndex, int lastIndex) {
		int midIndex;
		if (firstIndex < lastIndex) {
			midIndex = (firstIndex + lastIndex) / 2;
			mergeSort(firstIndex, midIndex);
			mergeSort(midIndex + 1, lastIndex);
			merge(firstIndex, midIndex, lastIndex);
		}
	}
	static void mergeSort2(){
		Stack<int[]> stack = new Stack<>();
		int[] cloneArray = new int[numberList.length];
		int[] sortedArray = new int[numberList.length];
		int count = 0;
		int[] temp, temp1, temp2;
		System.arraycopy(numberList, 0, cloneArray, 0, numberList.length);
		stack.push(cloneArray);
		while(!stack.isEmpty()){
			temp = stack.pop();
			if(temp.length != 1){
				temp1 = new int[(temp.length+1)/2];
				temp2 = new int[temp.length/2];
				System.arraycopy(temp, 0, temp1, 0, temp1.length);
				System.arraycopy(temp, temp1.length, temp2, 0, temp2.length);
				stack.push(temp2);
				stack.push(temp1);
			}
			else{
				if(count==0){
					sortedArray[count++] = temp[0];
				}
				else{
					int check=0;
					for(int i=0;i<count;i++){
						if(sortedArray[i]<temp[0]){
							check = i+1;
						}
					}
					if(count==check){
						sortedArray[count++] = temp[0];
					}
					else{
						System.arraycopy(sortedArray, check, sortedArray, check+1, count-check);
						sortedArray[check] = temp[0];
						count++;
					}
					
				}
				
			}
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inputNumber = scan.nextInt();
		numberList = new int[inputNumber];
/*		for (int i = 0; i < inputNumber; i++) {
			numberList[i] = scan.nextInt();
		}
*/		
		//testcase
		for (int i = 0; i < inputNumber; i++) {
			numberList[i] = inputNumber-i;
		}
		
		long startTime, endTime;
		//recursionSource
		startTime = System.currentTimeMillis();
		//mergeSort(0, inputNumber - 1);
		mergeSort2();
		endTime = System.currentTimeMillis();
		
		
		System.out.println("½Ã°£ : "+(endTime - startTime));
		for (int i = 0; i < inputNumber; i++) {
			//System.out.println(numberList[i]);
		}
	}
}
