package study.BFS_DFS;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;


public class Area2583 {
	
	static int[][] board;
	static boolean[][] visited;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int M, N, K;
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		M = sc.nextInt();
		N = sc.nextInt();
		K = sc.nextInt();
		
		board = new int[M][N];
		visited = new boolean[M][N];
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<K; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            for (int y = y1; y < y2; y++) {
                for (int x = x1; x < x2; x++) {
                    board[y][x] = 1;
                }
            }
		}
		int cnt = 0;
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				if(!visited[i][j] && board[i][j] == 0) {
					visited[i][j] = true;
					list.add(bfs(i, j));
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		Collections.sort(list);
		for(int i : list) {
			System.out.print(i + " ");
		}
	}
	
	private static int bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {x, y});
		int area = 1;
		while(!q.isEmpty()) {
			int[] now = q.poll();
			for(int k=0; k<4; k++) {
				int nx = now[0] + dx[k];
				int ny = now[1] + dy[k];
				if(nx < 0 || ny < 0 || nx >= M || ny >= N) continue;
				if(!visited[nx][ny] && board[nx][ny] == 0) {
					q.offer(new int[] {nx, ny});
					visited[nx][ny] = true;
					area++;
				}
			}
		}
		return area;
	}
}
