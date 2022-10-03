package study.BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Tomato7576 {
	
	static int M, N;
	static int[][] board;
	static int[][] vis;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		board = new int[N][M];
		vis = new int[N][M];
		
		Queue<int[]> queue = new LinkedList<>();
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
				if(board[i][j] == 1)
					queue.add(new int[] {i, j});
				if(board[i][j] == 0)
					vis[i][j] = -1;
			}
		}
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			for(int k=0; k<4; k++) {
				int x = now[0] + dx[k];
				int y = now[1] + dy[k];
				if(x >= 0 && y >= 0 && x < N && y < M) {
					if(vis[x][y] == -1) {
						vis[x][y] = vis[now[0]][now[1]] + 1;
						queue.add(new int[] {x, y});
					}
				}
			}
		}
		
		int ans = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(vis[i][j] == -1) {
					System.out.println(-1);
					return;
				}
				ans = Math.max(ans, vis[i][j]);
			}
		}
		System.out.println(ans);
	}
}
