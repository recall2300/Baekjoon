package _08_05_10250_ACMhotel;

import java.util.Scanner;

public class Main {
	static int[] count(int[][] hotel, int N) {
		int count = 1;
		int H = hotel.length;
		int W = hotel[0].length;
		int[] hw = new int[2];
		for (int w = 1; w < W; w++) {
			for (int h = 1; h < H; h++) {
				hotel[h][w] = count;
				if (count == N) {
					hw[0] = w < 10 ? h * 10 : h;
					hw[1] = w;
					return hw;
				}
				count += 1;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t = 0; t < T; t++) {
			int H = scan.nextInt();
			int W = scan.nextInt();
			int N = scan.nextInt();
			int count = 1;
			int[][] hotel = new int[H + 1][W + 1];
			int[] result = count(hotel, N);

			String k = result[0] + ""+result[1];
			System.out.println(k);
		}

	}

}
