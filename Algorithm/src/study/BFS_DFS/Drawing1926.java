package study.BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Drawing1926 {
	
	static int n, m;
	static int max = 0;
	static int[][] board;
	static boolean[][] visited;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		board = new int[n][m];
		visited = new boolean[n][m];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int cnt = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(board[i][j] == 1 && !visited[i][j]) {
					bfs(i, j);
					cnt++;
				}
			}
		}

		System.out.println(cnt);
		System.out.println(max);
	}
	
	static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		visited[x][y] = true;
		q.add(new int[] {x, y});
		int area = 0;
		while(!q.isEmpty()) {
			area++;
			int[] now = q.poll();
			for(int dir=0; dir<4; dir++) {
				int nx = now[0] + dx[dir];
				int ny = now[1] + dy[dir];
				if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
				if(visited[nx][ny] || board[nx][ny] != 1) continue;
				visited[nx][ny] = true;
				q.add(new int[] {nx, ny});
			}
		}
		max = Math.max(max, area);
	}
}