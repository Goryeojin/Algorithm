package study.BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Cabbage1012 {
	
	static int M, N, K;
	static int[][] board;
	static boolean[][] vis;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int cnt;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int c=0; c<T; c++) {
			st = new StringTokenizer(br.readLine());
			
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			
			board = new int[M][N];
			vis = new boolean[M][N];
			cnt = 0;
			
			for(int j=0; j<K; j++) {
				st = new StringTokenizer(br.readLine());
				board[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
			}
			for(int i=0; i<M; i++) {
				for(int j=0; j<N; j++) {
					if(board[i][j] == 1 && !vis[i][j]) {
						BFS(i, j);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}
	
	private static void BFS(int i, int j) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {i, j});
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			vis[now[0]][now[1]] = true;
			for(int k=0; k<4; k++) {
				int x = now[0] + dx[k];
				int y = now[1] + dy[k];
				if(x < 0 || x >= M || y < 0 || y >= N) continue;
				if(vis[x][y] || board[x][y] != 1) continue;
				vis[x][y] = true;
				queue.add(new int[] {x, y});
			}
		}
	}
}
