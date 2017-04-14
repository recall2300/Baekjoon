package _14499_Dice;

import java.util.Scanner;

class Dice {
	int[][] dice;
	int x;
	int y;
	int N;
	int M;
	boolean success;

	public Dice() {

	}

	public Dice(int x, int y, int N, int M) {
		this.dice = new int[5][4];
		this.success = true;
		this.x = x;
		this.y = y;
		this.N = N;
		this.M = M;
	}

	public void move(int input) {
		switch (input) {
		case 1:
			if (y + 1 < M) {
				one();
			} else {
				success = false;
			}
			break;
		case 2:
			if (y - 1 >= 0) {
				two();
			} else {
				success = false;
			}
			break;
		case 3:
			if (x - 1 >= 0) {
				three();
			} else {
				success = false;
			}
			break;
		case 4:
			if (x + 1 < N) {
				four();
			} else {
				success = false;
			}
			break;
		default:
			break;
		}
	}

	public void one() {
		this.y += 1;
		int temp = dice[2][3];
		dice[2][3] = dice[2][2];
		dice[2][2] = dice[2][1];
		dice[2][1] = dice[4][2];
		dice[4][2] = temp;
	}

	public void two() {
		this.y += -1;
		int temp = dice[2][1];
		dice[2][1] = dice[2][2];
		dice[2][2] = dice[2][3];
		dice[2][3] = dice[4][2];
		dice[4][2] = temp;

	}

	public void three() {
		this.x += -1;
		int temp = dice[1][2];
		dice[1][2] = dice[2][2];
		dice[2][2] = dice[3][2];
		dice[3][2] = dice[4][2];
		dice[4][2] = temp;

	}

	public void four() {
		this.x += 1;
		int temp = dice[4][2];
		dice[4][2] = dice[3][2];
		dice[3][2] = dice[2][2];
		dice[2][2] = dice[1][2];
		dice[1][2] = temp;

	}

	public int[] getXY() {
		int[] xy = new int[2];
		xy[0] = this.y;
		xy[1] = this.x;
		return xy;
	}

	public int getTop() {
		return dice[2][2];
	}

	public int getBottom() {
		return dice[4][2];
	}

	public void setBottom(int n) {
		dice[4][2] = n;
	}

	public boolean isSuccess() {
		return success;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int K = scan.nextInt();
		Dice dice = new Dice(x, y, N, M);
		int[][] map = new int[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				map[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i < K; i++) {
			int input = scan.nextInt();
			dice.move(input);
			int[] xy = dice.getXY();
			int mapValue = map[xy[1]][xy[0]];
			if (dice.isSuccess()) {
				if (mapValue == 0) {
					map[xy[1]][xy[0]] = dice.getBottom();
				} else {
					dice.setBottom(mapValue);
					map[xy[1]][xy[0]] = 0;
				}
				System.out.println(dice.getTop());
			} else {
				dice.success = true;
			}

		}

	}

}
