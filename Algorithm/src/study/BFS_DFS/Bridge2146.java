package study.BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bridge2146 {
	
	static int N, min;
	static int id = 2;
	static int[][] board;
	static boolean[][] visit;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		board = new int[N][N];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		min = Integer.MAX_VALUE;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(board[i][j] == 1) {
					islandCount(i, j);
				}
			}
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(board[i][j] >= 2) {
					visit = new boolean[N][N];
					bfs(i, j);
				}
			}
		}
		System.out.println(min);
	}
	
	static void islandCount(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		
		q.add(new int[] {x, y});
		board[x][y] = id;
		
		while(!q.isEmpty()) {
			int[] now = q.poll();
			
			for(int k=0; k<4; k++) {
				int nx = now[0] + dx[k];
				int ny = now[1] + dy[k];
				if(nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
				if(board[nx][ny] == 1) {
					q.add(new int[] {nx, ny});
					board[nx][ny] = id;
				}
			}
		}
		id++;
	}
	
	static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		
		q.add(new int[] {x, y, 0});
		int num = board[x][y];
		visit[x][y] = true;
		
		while(!q.isEmpty()) {
			int[] now = q.poll();
			for(int k=0; k<4; k++) {
				int nx = now[0] + dx[k];
				int ny = now[1] + dy[k];
				if(nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
				if(visit[nx][ny] || board[nx][ny] == num) continue;
				visit[nx][ny] = true;
				if(board[nx][ny] == 0) {
					q.add(new int[] {nx, ny, now[2] + 1});
				} else {
					min = Math.min(min, now[2]);
				}
			}
		}
		
	}
}
