package _10875_Snake;

import java.util.*;

public class Main2 {

	public static void main(String[] args) {

		class Line {// 원래위치 x,y 크기순서로 x1<x2,(start<end)
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

			public int colision2(Line pLine) {// 겹치기 전까지 시간
				int time = 0;

				if (this.startX == this.endX)// 세로 선분
				{
					if (pLine.startX == pLine.endX && this.startX == pLine.startX)// 내라인
																					// 세로,
																					// 비교도
																					// 세로일때
																					// ->둘다
																					// 세로,
																					// 같은
																					// 위치
																					// x가
																					// 겹칠경우
																					// -충돌
					{
						if (pLine.startY <= this.startY && this.startY <= pLine.endY)// pLine이
																						// 더
																						// 앞에,
																						// pLine의
																						// 끝과
																						// 내
																						// 라인의
																						// 시작을
																						// 비교,
																						// 겹친경우
						{
							time = Math.min(Math.abs(this.oriY - pLine.endY), Math.abs(this.oriY - pLine.startY));
						} else if (this.startY <= pLine.startY && pLine.startY <= this.endY)// 내
																							// 라인이
																							// 더
																							// 앞에,
																							// p라인의
																							// 시작과
																							// 내라인끝
																							// 비교,
																							// 겹친경우
						{
							time = Math.min(Math.abs(this.oriY - pLine.startY), Math.abs(this.oriY - pLine.endY));
						}

					} else if (pLine.endY == pLine.startY)// 내라인 세로, 비교가 가로일때 ->
															// 교점 있나 찾아보기
					{
						if (this.startY <= pLine.startY && pLine.startY <= this.endY && pLine.startX <= this.startX
								&& this.startX <= pLine.endX)// 내라인Y사이에 상대방 라인이
																// 껴있을때
						{
							time = this.oriY - pLine.startY;

						}
					}
				} else if (endY == startY)// 내 라인 가로선분
				{
					if (pLine.startX == pLine.endX)// 비교가 세로일때 -> 교점 찾아보기
					{
						if (this.startX <= pLine.startX && pLine.startX <= this.endX && pLine.startY <= this.startY
								&& this.startY <= pLine.endY)// 내라인X사이에 상대방 라인이
																// 껴있을때
						{
							time = this.oriX - pLine.startX;

						}
					}
					if (pLine.startY == pLine.endY && this.startY == pLine.startY)// 내라인
																					// 가로,
																					// 비교도
																					// 가로일때
																					// ->둘다
																					// 가로,
																					// 같은
																					// 위치
																					// Y가
																					// 겹칠경우
																					// -충돌
					{
						if (pLine.startX <= this.startX && this.startX <= pLine.endX)// pLine이
																						// 더
																						// 앞에,
																						// pLine의
																						// 끝과
																						// 내
																						// 라인의
																						// 시작을
																						// 비교,
																						// 겹친경우
						{
							time = Math.min(Math.abs(this.oriX - pLine.endX), Math.abs(this.oriX - pLine.startX));
						} else if (this.startX <= pLine.startX && pLine.startX <= this.endX)// 내
																							// 라인이
																							// 더
																							// 앞에,
																							// p라인의
																							// 시작과
																							// 내라인끝
																							// 비교,
																							// 겹친경우
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
		int curX = 0;// 이전 x,y마지막 위치
		int curY = 0;
		int curDir = 0; // 0:오, 1:위, 2:왼, 3:아래

		boolean flag = false;// 충돌여부

		int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };// 오른,위,왼,아래

		ArrayList<Line> lineArray = new ArrayList<Line>();
		// 바깥 범위 라인 만들어 놓자.
		lineArray.add(new Line(-N - 1, -N - 1, -N - 1, N + 1));// 왼쪽벽
		lineArray.add(new Line(-N - 1, -N - 1, N + 1, -N - 1));// 아래벽
		lineArray.add(new Line(-N - 1, N + 1, N + 1, N + 1));// 위벽
		lineArray.add(new Line(N + 1, -N - 1, N + 1, N + 1));// 오른쪽벽

		int i = 0;
		// 입력받으면서 바로 선분 만들자!
		for (i = 0; i < M; i++) {

			int a = sc.nextInt();
			char b = (char) sc.next().charAt(0);
			int newX = curX + a * dir[curDir][0];
			int newY = curY + a * dir[curDir][1];

			// 새 라인 생성!
			Line nLine = new Line(curX, curY, newX, newY);//

			// 바로 이전 선분들이랑 겹치는지 체크하자!//직전 것이랑은 체크하면안된다!-마지막점이 항상겹침;
			// -가까운선먼저..비교..어떻게?
			int temptime = 200000001;// 제일 가까운 충돌 시간을 찾기위한...
			for (int j = 0; j < lineArray.size(); j++) {
				// 직전 선분 체크안하기 위해..(벽4개는체크해야됨 0~3: j>3)
				if (j > 3 && j == lineArray.size() - 1)
					break;

				Line pLine = lineArray.get(j);
				int t = nLine.colision2(pLine);
				if (t != 0)// 충돌
				{
					temptime = Math.min(temptime, t);
					flag = true;
				}
			}

			if (flag) {
				time += temptime;
				break;
			}

			time += a; // 충돌안했을시 라인길이만큼 시간 더하고
			lineArray.add(nLine); // 충돌안한 라인 넣음!

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

		for (i += 1; i < M; i++) {// 남은 입력 비워주기...i도중에끊겨서 하나더한것부터 M까지..
			sc.nextInt();
			sc.next().charAt(0);
		}

		sc.close();

		if (!flag)// 충돌안했을시 벽과 선분하나 만들어 비교
		{
			int newX = curX;
			int newY = curY;
			if (curDir == 0)// 오른쪽 가는 중 벽까지
				newX = N + 1;
			else if (curDir == 1)// 위 가는 중 벽까지
				newY = N + 1;
			else if (curDir == 2)// 왼쪽 가는 중 벽까지
				newX = -N - 1;
			else if (curDir == 3)// 아래 가는 중 벽까지
				newY = -N - 1;

			Line nLine = new Line(curX, curY, newX, newY);
			int temptime = 200000001;// 제일 가까운 충돌 시간을 찾기위한...
			for (int j = 0; j < lineArray.size(); j++) {
				// 직전 선분 체크안하기 위해..(벽4개는체크해야됨 0~3)
				if (j > 3 && j == lineArray.size() - 1)
					break;

				Line pLine = lineArray.get(j);
				int t = nLine.colision2(pLine);
				if (t != 0)// 충돌
				{
					temptime = Math.min(temptime, t);
					flag = true;
				}
			}
			time += temptime;// 무조건 충돌하니까 그냥 더해줌
		}
		System.out.print(time);

	}

}