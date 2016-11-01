package _09_2_2751_SortNumber_HeapSort_Timeover;

import java.util.Scanner;

public class Main {
	
	static int[] numberList = null;
	
	public static int pop(){
		int popValue = numberList[1];
		int[] cloneList = new int[numberList.length-1];
		numberList[1] = numberList[numberList.length-1];
		System.arraycopy(numberList, 0, cloneList, 0, cloneList.length);
		numberList = cloneList;
		heapify(1);
		return popValue;
	}
	public static void heapify(int pointer){
		int leftChild = pointer*2;
		int rightChild = (pointer*2)+1;
		int changeChildNumber = pointer; 
		int swapTemp;
		int lastChild = numberList.length-1;
		
		
		if(lastChild >= leftChild){
			if(numberList[pointer]>numberList[leftChild]){
				changeChildNumber = leftChild;
			}
		}
		
		if(lastChild >= rightChild){
			if(numberList[changeChildNumber]>numberList[rightChild]){
				changeChildNumber = rightChild;
			}
		}
		
		if(changeChildNumber != pointer){
			swapTemp = numberList[pointer];
			numberList[pointer] = numberList[changeChildNumber];
			numberList[changeChildNumber] = swapTemp;
			
			heapify(changeChildNumber);
		}
		
	}
	
	public static void minHeap(){
		int pointer = (numberList.length-1)/2 == 0 ? 1 : (numberList.length-1)/2;
		while(pointer > 0){
			heapify(pointer--);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inputNumber = scan.nextInt();
		StringBuffer sb = new StringBuffer();
		numberList = new int[inputNumber+1];
		
		//testcase
		long startTime, endTime;
		for (int i = 0; i < inputNumber; i++) {
			numberList[i] = inputNumber-i;
		}
		
//		for(int i = 1; i<numberList.length;i++){
//			numberList[i] = scan.nextInt();
//		}
		startTime = System.currentTimeMillis();
		minHeap();
		endTime = System.currentTimeMillis();
		
		for(int i = 0;i<inputNumber;i++){
			sb.append(pop());
			sb.append("\n");
		}
		//System.out.println(sb.toString());
		System.out.println("½Ã°£ : "+(endTime - startTime));
	}
}
