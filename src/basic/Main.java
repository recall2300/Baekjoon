package basic;

public class Main {
	//
	static void combination(int[] array, int size, int m, int n, int index) {
		// 종료조건
		if (size == n) {
			return;
		}
		if (m == index) {
			return;
		}
		// 분기조건
		array[size] = index;
		combination(array, size + 1, m, n, index + 1);
		combination(array, size, m, n, index + 1);
	}

	static void rCombination(int[] array, int size, int m, int n, int index) {
		// 종료조건
		if (size == n) {
			return;
		} else if (index == m) {
			return;
		}
		// 분기조건
		array[size] = index;
		rCombination(array, size + 1, m, n, index);
		rCombination(array, size, m, n, index + 1);
	}

	static void swap(int[] array, int m, int n) {
		int temp = array[m];
		array[m] = array[n];
		array[n] = temp;
	}

	static void permutation(int[] array, int size, int m, int n) {
		// 종료조건
		if (size == n) {
			return;
		}
		// 분기조건
		for (int i = size; i < m; i++) {
			swap(array, i, size);
			permutation(array, size + 1, m, n);
			swap(array, i, size);
		}
	}

	static void rPermutation(int[] array, int size, int m, int n) {
		// 종료조건
		if (size == n) {
			return;
		}
		// 분기조건
		for (int i = 0; i < m; i++) {
			array[size] = i;
			rPermutation(array, size+1, m, n);
		}

	}
	static void print(int[] array, int size){
		for (int i=0;i<size;i++){
			if (i==size-1){
				System.out.println(array[i]);
			}
			else{
				System.out.print(array[i]+",");
			}
		}
	}

	public static void main(String args[]) {

	}
}
