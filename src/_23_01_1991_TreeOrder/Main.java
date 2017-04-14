package _23_01_1991_TreeOrder;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static void preorder(String[] tree, int n) {
		if (tree[n].equals(".")) {
			return;
		}
		System.out.print(tree[n]);
		preorder(tree, n * 2);
		preorder(tree, n * 2 + 1);

	}

	static void inorder(String[] tree, int n) {
		if (tree[n].equals(".")) {
			return;
		}
		inorder(tree, n * 2);
		System.out.print(tree[n]);
		inorder(tree, n * 2 + 1);
	}

	static void postorder(String[] tree, int n) {
		if (tree[n].equals(".")) {
			return;
		}
		postorder(tree, n * 2);
		postorder(tree, n * 2 + 1);
		System.out.print(tree[n]);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String[] tree = new String[67108863];
		Arrays.fill(tree, ".");
		tree[1] = "A";
		scan.nextLine();
		for (int i = 0; i < N; i++) {
			String[] input = scan.nextLine().split(" ");
			String root = input[0];
			String leftChild = input[1];
			String rightChild = input[2];
			for (int j = 1; j < tree.length; j++) {
				if (tree[j].equals(root)) {
					tree[j * 2] = leftChild;
					tree[j * 2 + 1] = rightChild;
					break;
				}
			}
		}
		preorder(tree, 1);
		System.out.println();
		inorder(tree, 1);
		System.out.println();
		postorder(tree, 1);
	}

}
