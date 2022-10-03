package study.BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Nite7562 {
	
	static int[][] visited;
	static int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
	static int[] dy = {-2, -1, 1, 2, 2, 1, -1, -2};
	static int I;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int res = 0;
		
		for(int i=0; i<T; i++) {
			I = Integer.parseInt(br.readLine());
			visited = new int[I][I];
			for(int j=0; j<I; j++) {
				for(int k=0; k<I; k++) {
					visited[j][k] = -1;
				}
			}
			String[] input = br.readLine().split(" ");
			int x = Integer.parseInt(input[0]);
			int y = Integer.parseInt(input[1]);
			input = br.readLine().split(" ");
			int gx = Integer.parseInt(input[0]);
			int gy = Integer.parseInt(input[1]);
			res = bfs(x, y, gx, gy);
			System.out.println(res);
		}
	}
	
	private static int bfs(int x, int y, int gx, int gy) {
		Queue<int[]> q = new LinkedList<>();
		
		q.offer(new int[] {x, y});
		visited[x][y] = 0;
		
		while(!q.isEmpty()) {
			int[] now = q.poll();
			
			if(now[0] == gx && now[1] == gy) return visited[now[0]][now[1]];
			
			for(int i=0; i<8; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
//				if(nx == gx && ny == gy) return visited[now[0]][now[1]] + 1;
				if(nx < 0 || ny < 0 || nx >= I || ny >= I || visited[nx][ny] >= 0) continue;
				visited[nx][ny] = visited[now[0]][now[1]] + 1;
				q.offer(new int[] {nx, ny});
			}
		}
		return -1;
	}

}
