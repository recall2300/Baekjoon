package _10875_Snake;

import java.util.Scanner;

class Snake {
	int direction;
	int x;
	int y;
	int size;
	boolean out = false;

	Snake(int y, int x, int size) {
		this.y = y;
		this.x = x;
		this.size = size;
		this.direction = 1;
	}

	void setDirection(String direction) {
		if (direction.equals("R")) {
			if (this.direction == 1) {
				this.direction = 4;
			} else {
				this.direction -= 1;
			}

		} else {
			if (this.direction == 4) {
				this.direction = 1;
			} else {
				this.direction += 1;
			}

		}
	}

	void moveOne() {
		switch (this.direction) {
		case 1:
			addX(1);
			break;
		case 2:
			addY(-1);
			break;
		case 3:
			addX(-1);
			break;
		case 4:
			addY(1);
			break;
		}
	}

	void addX(int x) {
		this.x += x;
	}

	void addY(int y) {
		this.y += y;
	}

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}

	boolean isOut() {
		if (x > size - 1 || x < 0) {
			out = true;
		}
		if (y > size - 1 || y < 0) {
			out = true;
		}
		return out;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sX, sY;
		int L = scan.nextInt();
		int size = 2 * L + 1;
		int[][] map = new int[size][size];
		int N = scan.nextInt();
		int count = 0;
		boolean isDeath = false;
		scan.nextLine();
		String[] orders = new String[N];
		Snake snake = new Snake(L, L, size);
		map[L][L] = 1;
		for (int i = 0; i < N; i++) {
			orders[i] = scan.nextLine();
		}
		for (int i = 0; i < N; i++) {
			String[] temp = orders[i].split(" ");
			int move = Integer.parseInt(temp[0]);
			String turn = temp[1];
			for (int j = 1; j <= move; j++) {
				snake.moveOne();
				count++;
				sX = snake.getX();
				sY = snake.getY();
				if (snake.isOut()) {
					isDeath = true;
					break;
				} else if (map[sY][sX] == 1) {
					isDeath = true;
					break;
				} else {
					map[sY][sX]++;
				}
			}
			if (isDeath) {
				System.out.println(count);
				break;
			}
			snake.setDirection(turn);
		}
		if (!isDeath) {
			while (true) {
				snake.moveOne();
				count++;
				sX = snake.getX();
				sY = snake.getY();
				if (snake.isOut()) {
					isDeath = true;
					break;
				} else if (map[sY][sX] == 1) {
					isDeath = true;
					break;
				} else {
					map[sY][sX]++;
				}
			}
			System.out.println(count);
		}
		
	}
}
