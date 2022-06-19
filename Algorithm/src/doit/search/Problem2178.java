package doit.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Problem2178 {
	/*
	 * BFS �� �̷�ã��
	
	dx, dy(�����¿츦 Ž���ϱ� ���� define�� ���� ����)
	A(������ ���� 2���� ���)
	N(row), M(column)
	visited(�湮 ��� ���� �迭)
	A �迭 �ʱ�ȭ�ϱ�
	visited �迭 �ʱ�ȭ�ϱ�
	for(N) {
		for(M) {
			A �迭�� ������ ����
		}
	}
	
	BFS(0, 0) �����ϱ�
	BFS {
		ť �ڷᱸ������ ���� ��� �����ϱ�(add)
		visited �迭�� ���� ��� �湮 ����ϱ�
		while(ť�� ��� ���� ������) {
			ť���� ��� �����͸� ��������(poll)
			for(�����¿� Ž��) {
				if(��ȿ�� ��ǥ) {
					if(�̵��� �� �ִ� ĭ�̸鼭 �湮���� ���� ���) {
						visited �迭�� �湮 ����ϱ�
						A �迭�� depth�� ���� ����� depth + 1�� ������Ʈ �ϱ�
						ť�� ������ �����ϱ�(add)
					}
				}
			}
		}
	}
	 */
	
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {1, 0, -1, 0};
	static boolean[][] visited;
	static int [][] A;
	static int N, M;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		A = new int[N][M];
		visited = new boolean[N][M];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			for(int j=0; j<M; j++) {
				A[i][j] = Integer.parseInt(line.substring(j, j+1));
			}
		}
		
		BFS(0, 0);
		System.out.println(A[N-1][M-1]);
	}
	
	public static void BFS(int i, int j) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] {i, j});
		while(!queue.isEmpty()) {
			int now[] = queue.poll();
			visited[i][j] = true;
			for(int k=0; k<4; k++) {
				int x = now[0] + dx[k];
				int y = now[1] + dy[k];
				if(x >= 0 && y >= 0 && x < N && y < M) {
					if(A[x][y] != 0 && !visited[x][y]) {
						visited[x][y] = true;
						A[x][y] = A[now[0]][now[1]] + 1;
						queue.add(new int[] {x, y});
					}
				}
			}
		}
	}

}
