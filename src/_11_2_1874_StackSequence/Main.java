package _11_2_1874_StackSequence;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputNumber = sc.nextInt();
		int[] numberList = new int[inputNumber];
		LinkedList<Integer> stack = new LinkedList<>();
		StringBuffer sb = new StringBuffer("");
		for (int i = 0; i < inputNumber; i++) {
			numberList[i] = sc.nextInt();
		}
		int[] sortList = numberList.clone();
		Arrays.sort(sortList);
		int stackPointer = 0;
		boolean result = true;
		for (int i = 0; i < numberList.length;) {
			if(!(stackPointer<sortList.length)){
				result = false;
				break;
			}
			stack.push(sortList[stackPointer]);
			sb.append("+\n");
			stackPointer++;
			if (numberList[i] != stack.peek()) {
			} else {
				while (numberList[i] == stack.peek()) {
					stack.pop();
					sb.append("-\n");
					i++;
					if(stack.isEmpty()){
						break;
					}
				}

			}
		}
		if(result){
			System.out.print(sb.toString());
		}
		else{
			System.out.println("NO");
		}
		
	}

}
