package study.BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class TomatoHard7569 {
	static int M, N, H;
	static int[][][] board;
	static int[][][] vis;
	static int[] dx = {1, 0, -1, 0, 0, 0};
	static int[] dy = {0, 1, 0, -1, 0, 0};
	static int[] dz = {0, 0, 0, 0, 1, -1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		
		board = new int[H][N][M];
		vis = new int[H][N][M];
		
		Queue<int[]> queue = new LinkedList<>();
		
		for(int i=0; i<H; i++) {
			for(int j=0; j<N; j++) {
				st = new StringTokenizer(br.readLine());
				for(int k=0; k<M; k++) {
					board[i][j][k] = Integer.parseInt(st.nextToken());
					if(board[i][j][k] == 1)
						queue.add(new int[] {i, j, k});
					if(board[i][j][k] == 0)
						vis[i][j][k] = -1;
				}
			}
		}
		
		while(!queue.isEmpty()) {
			int[] now = queue.poll();
			for(int k=0; k<6; k++) {
				int z = now[0] + dz[k];
				int x = now[1] + dx[k];
				int y = now[2] + dy[k];
				if(x >= 0 && y >= 0 && x < N && y < M && z >= 0 && z < H) {
					if(vis[z][x][y] == -1) {
						vis[z][x][y] = vis[now[0]][now[1]][now[2]] + 1;
						queue.add(new int[] {z, x, y});
					}
				}
			}
		}
		
		int ans = 0;
		for(int i=0; i<H; i++) {
			for(int j=0; j<N; j++) {
				for(int k=0; k<M; k++) {
					if(vis[i][j][k] == -1) {
						System.out.println(-1);
						return;
					}
					ans = Math.max(ans, vis[i][j][k]);
				}
			}	
		}
		System.out.println(ans);
	}
}
