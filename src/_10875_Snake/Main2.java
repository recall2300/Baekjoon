package _10875_Snake;

import java.util.*;

public class Main2 {

	public static void main(String[] args) {

		class Line {// ������ġ x,y ũ������� x1<x2,(start<end)
			int oriX, oriY;
			int startX, startY, endX, endY;

			public Line(int x1, int y1, int x2, int y2) {

				this.oriX = x1;
				this.oriY = y1;

				if (x1 >= x2) {
					this.startX = x2;
					this.endX = x1;
				} else if (x2 > x1) {
					this.startX = x1;
					this.endX = x2;
				}
				if (y1 >= y2) {
					this.startY = y2;
					this.endY = y1;
				} else if (y2 > y1) {
					this.startY = y1;
					this.endY = y2;
				}

			}

			public int colision2(Line pLine) {// ��ġ�� ������ �ð�
				int time = 0;

				if (this.startX == this.endX)// ���� ����
				{
					if (pLine.startX == pLine.endX && this.startX == pLine.startX)// ������
																					// ����,
																					// �񱳵�
																					// �����϶�
																					// ->�Ѵ�
																					// ����,
																					// ����
																					// ��ġ
																					// x��
																					// ��ĥ���
																					// -�浹
					{
						if (pLine.startY <= this.startY && this.startY <= pLine.endY)// pLine��
																						// ��
																						// �տ�,
																						// pLine��
																						// ����
																						// ��
																						// ������
																						// ������
																						// ��,
																						// ��ģ���
						{
							time = Math.min(Math.abs(this.oriY - pLine.endY), Math.abs(this.oriY - pLine.startY));
						} else if (this.startY <= pLine.startY && pLine.startY <= this.endY)// ��
																							// ������
																							// ��
																							// �տ�,
																							// p������
																							// ���۰�
																							// �����γ�
																							// ��,
																							// ��ģ���
						{
							time = Math.min(Math.abs(this.oriY - pLine.startY), Math.abs(this.oriY - pLine.endY));
						}

					} else if (pLine.endY == pLine.startY)// ������ ����, �񱳰� �����϶� ->
															// ���� �ֳ� ã�ƺ���
					{
						if (this.startY <= pLine.startY && pLine.startY <= this.endY && pLine.startX <= this.startX
								&& this.startX <= pLine.endX)// ������Y���̿� ���� ������
																// ��������
						{
							time = this.oriY - pLine.startY;

						}
					}
				} else if (endY == startY)// �� ���� ���μ���
				{
					if (pLine.startX == pLine.endX)// �񱳰� �����϶� -> ���� ã�ƺ���
					{
						if (this.startX <= pLine.startX && pLine.startX <= this.endX && pLine.startY <= this.startY
								&& this.startY <= pLine.endY)// ������X���̿� ���� ������
																// ��������
						{
							time = this.oriX - pLine.startX;

						}
					}
					if (pLine.startY == pLine.endY && this.startY == pLine.startY)// ������
																					// ����,
																					// �񱳵�
																					// �����϶�
																					// ->�Ѵ�
																					// ����,
																					// ����
																					// ��ġ
																					// Y��
																					// ��ĥ���
																					// -�浹
					{
						if (pLine.startX <= this.startX && this.startX <= pLine.endX)// pLine��
																						// ��
																						// �տ�,
																						// pLine��
																						// ����
																						// ��
																						// ������
																						// ������
																						// ��,
																						// ��ģ���
						{
							time = Math.min(Math.abs(this.oriX - pLine.endX), Math.abs(this.oriX - pLine.startX));
						} else if (this.startX <= pLine.startX && pLine.startX <= this.endX)// ��
																							// ������
																							// ��
																							// �տ�,
																							// p������
																							// ���۰�
																							// �����γ�
																							// ��,
																							// ��ģ���
						{
							time = Math.min(Math.abs(this.oriX - pLine.startX), Math.abs(this.oriX - pLine.endX));
						}
					}
				}

				return Math.abs(time);
			}

		}

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int time = 0;
		int curX = 0;// ���� x,y������ ��ġ
		int curY = 0;
		int curDir = 0; // 0:��, 1:��, 2:��, 3:�Ʒ�

		boolean flag = false;// �浹����

		int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };// ����,��,��,�Ʒ�

		ArrayList<Line> lineArray = new ArrayList<Line>();
		// �ٱ� ���� ���� ����� ����.
		lineArray.add(new Line(-N - 1, -N - 1, -N - 1, N + 1));// ���ʺ�
		lineArray.add(new Line(-N - 1, -N - 1, N + 1, -N - 1));// �Ʒ���
		lineArray.add(new Line(-N - 1, N + 1, N + 1, N + 1));// ����
		lineArray.add(new Line(N + 1, -N - 1, N + 1, N + 1));// �����ʺ�

		int i = 0;
		// �Է¹����鼭 �ٷ� ���� ������!
		for (i = 0; i < M; i++) {

			int a = sc.nextInt();
			char b = (char) sc.next().charAt(0);
			int newX = curX + a * dir[curDir][0];
			int newY = curY + a * dir[curDir][1];

			// �� ���� ����!
			Line nLine = new Line(curX, curY, newX, newY);//

			// �ٷ� ���� ���е��̶� ��ġ���� üũ����!//���� ���̶��� üũ�ϸ�ȵȴ�!-���������� �׻��ħ;
			// -��������..��..���?
			int temptime = 200000001;// ���� ����� �浹 �ð��� ã������...
			for (int j = 0; j < lineArray.size(); j++) {
				// ���� ���� üũ���ϱ� ����..(��4����üũ�ؾߵ� 0~3: j>3)
				if (j > 3 && j == lineArray.size() - 1)
					break;

				Line pLine = lineArray.get(j);
				int t = nLine.colision2(pLine);
				if (t != 0)// �浹
				{
					temptime = Math.min(temptime, t);
					flag = true;
				}
			}

			if (flag) {
				time += temptime;
				break;
			}

			time += a; // �浹�������� ���α��̸�ŭ �ð� ���ϰ�
			lineArray.add(nLine); // �浹���� ���� ����!

			curX = newX;
			curY = newY;

			if (b == 'L') {
				curDir++;
				if (curDir == 4)
					curDir = 0;
			}
			if (b == 'R') {
				curDir--;
				if (curDir < 0)
					curDir = 3;
			}
		}

		for (i += 1; i < M; i++) {// ���� �Է� ����ֱ�...i���߿����ܼ� �ϳ����Ѱͺ��� M����..
			sc.nextInt();
			sc.next().charAt(0);
		}

		sc.close();

		if (!flag)// �浹�������� ���� �����ϳ� ����� ��
		{
			int newX = curX;
			int newY = curY;
			if (curDir == 0)// ������ ���� �� ������
				newX = N + 1;
			else if (curDir == 1)// �� ���� �� ������
				newY = N + 1;
			else if (curDir == 2)// ���� ���� �� ������
				newX = -N - 1;
			else if (curDir == 3)// �Ʒ� ���� �� ������
				newY = -N - 1;

			Line nLine = new Line(curX, curY, newX, newY);
			int temptime = 200000001;// ���� ����� �浹 �ð��� ã������...
			for (int j = 0; j < lineArray.size(); j++) {
				// ���� ���� üũ���ϱ� ����..(��4����üũ�ؾߵ� 0~3)
				if (j > 3 && j == lineArray.size() - 1)
					break;

				Line pLine = lineArray.get(j);
				int t = nLine.colision2(pLine);
				if (t != 0)// �浹
				{
					temptime = Math.min(temptime, t);
					flag = true;
				}
			}
			time += temptime;// ������ �浹�ϴϱ� �׳� ������
		}
		System.out.print(time);

	}

}