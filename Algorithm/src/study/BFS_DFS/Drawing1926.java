package study.BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Drawing1926 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] board = new int[n][m];
		boolean[][] vis = new boolean[n][m];
		
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int max = 0;
		int cnt = 0;
		Queue<Pair> queue = new LinkedList<>();
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(board[i][j] == 0 || vis[i][j]) continue;
				cnt++;
				vis[i][j] = true;
				queue.add(new Pair(i, j));
				int area = 0;
				while(!queue.isEmpty()) {
					area++;
					Pair cur = queue.poll();
					for(int dir=0; dir<4; dir++) {
						int nx = cur.x + dx[dir];
						int ny = cur.y + dy[dir];
						if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
						if(vis[nx][ny] || board[nx][ny] != 1) continue;
						vis[nx][ny] = true;
						queue.add(new Pair(nx, ny));
					}
				}
				max = Math.max(max, area);
			}
		}
		System.out.println(cnt);
		System.out.println(max);
	}
}

class Pair {
	int x;
	int y;
	
	Pair(int x, int y){
		this.x = x;
		this.y = y;
	}
}
