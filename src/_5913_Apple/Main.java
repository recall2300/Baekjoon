package _5913_Apple;

import java.util.Scanner;

public class Main {
	static int solve = 25;
	static int count = 0;
	static int[][] move = { { 0, 1 }, { 0, -1 }, { -1, 0 }, { 1, 0 } };

	static void DFS(int[][] map, int x, int y, int size) {
		int a, b;
		if (x == 4 && y == 4) {
			if (solve == size) {
				count++;
			}
			return;
		}
		for (int i = 0; i < 4; i++) {
			a = x + move[i][0];
			b = y + move[i][1];
			if ((a >= 0 && a < 5) && (b >= 0 && b < 5) && (map[a][b] != 1)) {
				map[a][b] = 1;
				DFS(map, a, b, size + 1);
				map[a][b] = 0;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] map = new int[5][5];
		int x, y;
		int K = scan.nextInt();
		solve = solve - K;
		count = x = y = 0;
		scan.nextLine();
		for (int t = 0; t < K; t++) {
			String[] ij = scan.nextLine().split(" ");
			int i = Integer.parseInt(ij[0]);
			int j = Integer.parseInt(ij[1]);
			map[i - 1][j - 1] = 1;
		}
		map[0][0] = 1;
		DFS(map, 0, 0, 1);
		System.out.println(count);
	}
}
