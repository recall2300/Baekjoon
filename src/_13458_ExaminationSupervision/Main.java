package _13458_ExaminationSupervision;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		long count = 0;
		int[] examRoom = new int[N];
		for (int i = 0; i < N; i++) {
			examRoom[i] = scan.nextInt();
		}
		int B = scan.nextInt();
		int C = scan.nextInt();
		for (int i = 0; i < N; i++) {
			examRoom[i] -= B;
			if (examRoom[i] < 0) {
				examRoom[i] = 0;
			}
			count++;
		}
		for (int i = 0; i < N; i++) {
			count += (long) (Math.ceil((float) examRoom[i] / (float) C));
		}
		System.out.println(count);
	}

}
