package study.BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class ColorWeakness10026 {
	
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static char[][] grid, cgrid;
	static int N;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		grid = new char[N][N];
		cgrid = new char[N][N];
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			for(int j=0; j<N; j++) {
				char c = str.charAt(j);
				grid[i][j] = c;
				
				if(c == 'G') cgrid[i][j] = 'R';
				else cgrid[i][j] = c;
			}
		}
		int cnt = bfs(grid);
		int ccnt = bfs(cgrid);
		System.out.println(cnt + " " + ccnt);
	}
	
	private static int bfs(char[][] draw) {
		int ans = 0;
		Queue<int[]> q = new LinkedList<>();
		boolean[][] visited = new boolean[N][N];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(visited[i][j]) continue;
				q.offer(new int[] {i, j});
				visited[i][j] = true;
				ans++;
				
				while(!q.isEmpty()) {
					int[] now = q.poll();
					for(int k=0; k<4; k++) {
						int nx = now[0] + dx[k];
						int ny = now[1] + dy[k];
						
						if(nx < 0 || ny < 0 || nx >= N || ny >= N || visited[nx][ny]) continue;
						if(draw[nx][ny] == draw[now[0]][now[1]]) {
							q.offer(new int[] {nx, ny});
							visited[nx][ny] = true;
						}
					}
				}
			}
		}
		return ans;
	}
}
