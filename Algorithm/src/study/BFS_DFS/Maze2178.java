package study.BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Maze2178 {

	static int[][] board;
	static boolean[][] vis;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int N, M;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		board = new int[N][M];
		vis = new boolean[N][M];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			for(int j=0; j<M; j++) {
				board[i][j] = Integer.parseInt(str.substring(j, j+1));
			}
		}
		
		BFS(0, 0);
		System.out.println(board[N-1][M-1]);
	}
	
	public static void BFS(int i, int j) {
		
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] {i, j});
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			vis[i][j] = true;
			for(int k=0; k<4; k++) {
				int nx = now[0] + dx[k];
				int ny = now[1] + dy[k];
				if(nx >= 0 && ny >= 0 && nx < N && ny < M) {
					if(board[nx][ny] != 0 && !vis[nx][ny]) {
						vis[nx][ny] = true;
						board[nx][ny] = board[now[0]][now[1]] + 1;
						queue.add(new int[] {nx, ny});
					}
				}
			}
		}
	}

}
