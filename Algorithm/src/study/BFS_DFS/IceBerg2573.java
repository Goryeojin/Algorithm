package study.BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class IceBerg2573 {
	
	static int N, M;
	static int[][] board;
	static boolean[][] check;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		board = new int[N][M];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		solve();
	}
	static void solve() {
		int year = 0;
		int island = 0;
		int ice = -1;
		while(true) {
			if(ice == 0) {
				System.out.println(0);
				break;
			} else {
				island = countOfIsland();
				
				if(island >= 2) {
					System.out.println(year);
					break;
				}
			}
			ice = melting();
			year++;
		}
	}
	
	static int countOfIsland() {
		int cnt = 0;
		check = new boolean[N][M];
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(board[i][j] != 0 && !check[i][j]) {
					bfs(i, j);
					cnt++;
				}
			}
		}
		return cnt;
	}
	
	static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		check[x][y] = true;
		q.add(new int[] {x, y});
		
		while(!q.isEmpty()) {
			int[] now = q.poll();
			for(int k=0; k<4; k++) {
				int nx = now[0] + dx[k];
				int ny = now[1] + dy[k];
				if(nx < 0 || ny < 0 || nx >= N || ny >= M || check[nx][ny]) continue;
				if(board[nx][ny] != 0) {
					check[nx][ny] = true;
					q.add(new int[] {nx, ny});
				}
			}
		}
	}
	static int melting() {
		int cnt = 0;
		boolean[][] visit = new boolean[N][M];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(board[i][j] != 0) {
					visit[i][j] = true;
					for(int k=0; k<4; k++) {
						int nx = i + dx[k];
						int ny = j + dy[k];
						if(nx < 0 || ny < 0 || nx >= N || ny >= M || visit[nx][ny]) continue;
						if(board[nx][ny] == 0 && board[i][j] > 0) board[i][j]--;
					}
					if(board[i][j] > 0) cnt++;
				}
			}
		}
		return cnt;
	}
}
