package _16_06_1005_ACMcraft;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		ArrayList<ArrayList<Integer>> XY;
		StringTokenizer st;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T, N, K, W, X, Y;
		int[] D, inDegree, cost;

		T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			XY = new ArrayList<ArrayList<Integer>>();
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());

			D = new int[N + 1];
			inDegree = new int[N + 1];
			cost = new int[N + 1];

			for (int i = 0; i <= N; i++) {
				D[i] = -1;
				inDegree[i] = 0;
				cost[i] = 0;
			}

			st = new StringTokenizer(br.readLine());
			for (int i = 1; i <= N; i++) {
				D[i] = Integer.parseInt(st.nextToken());
			}

			for (int i = 0; i <= N; i++) {
				XY.add(new ArrayList<Integer>());
			}

			for (int i = 0; i < K; i++) {

				st = new StringTokenizer(br.readLine());
				X = Integer.parseInt(st.nextToken());
				Y = Integer.parseInt(st.nextToken());

				XY.get(X).add(Y);
				inDegree[Y]++;
			}

			W = Integer.parseInt(br.readLine());

			Queue<Integer> queue = new LinkedList<Integer>();

			for (int i = 1; i <= N; i++) {
				if (inDegree[i] == 0) {
					queue.offer(i);
					cost[i] = D[i];
				}
			}

			for (int i = 0; i < N; i++) {
				if (queue.isEmpty()) {
					break;
				}

				int v = queue.poll();
				for (int nextNode : XY.get(v)) {

					inDegree[nextNode]--;

					if (cost[nextNode] < cost[v] + D[nextNode]) {
						cost[nextNode] = cost[v] + D[nextNode];
					}

					if (inDegree[nextNode] == 0) {
						queue.offer(nextNode);
					}
				}
			}

			System.out.println(cost[W]);

		}
	}
}