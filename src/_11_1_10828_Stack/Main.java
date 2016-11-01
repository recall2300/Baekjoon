package _11_1_10828_Stack;

import java.util.Scanner;

class Stack {
	int top = -1;
	int[] stackArray = new int[10];

	public void push(int inputValue) {
		if(this.full() == 1){
			this.resize();
		}
		stackArray[++top] = inputValue;
	}

	public int full() {
		if (stackArray.length-1 == top) {
			return 1;
		} else {
			return 0;
		}
	}

	public int pop() {
		if (this.empty() == 1) {
			return -1;
		} else {
			return stackArray[top--];
		}
	}

	public int empty() {
		if (this.size() == 0) {
			return 1;
		} else {
			return 0;
		}
	}

	public int top() {
		if (this.size() == 0) {
			return -1;
		} else {
			return stackArray[top];
		}
	}

	public int size() {
		return top + 1;
	}

	public void resize() {
		int[] tempArray = new int[stackArray.length * 2];
		System.arraycopy(stackArray, 0, tempArray, 0, stackArray.length);
		stackArray = tempArray;
	}

}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int instructions = sc.nextInt();
		Stack stack = new Stack();
		sc.nextLine();
		for(int i=0;i<instructions;i++){
			String inputString = sc.nextLine();
			String[] splitString = inputString.split(" ");
			switch(splitString[0]){
			case "push":
				stack.push(Integer.parseInt(splitString[1]));
				break;
			case "top":
				System.out.println(stack.top());
				break;
			case "size":
				System.out.println(stack.size());
				break;
			case "empty":
				System.out.println(stack.empty());
				break;
			case "pop":
				System.out.println(stack.pop());
				break;
			}
		}
	}

}
