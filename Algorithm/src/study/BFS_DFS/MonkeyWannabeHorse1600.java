package study.BFS_DFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MonkeyWannabeHorse1600 {

	static int k, w, h;
	static int[][] board;
	static int min = Integer.MAX_VALUE;
	static int[] hdx = {-2, -2, -1, -1, 1, 1, 2, 2};
	static int[] hdy = {-1, 1, -2, 2, -2, 2, -1, 1};
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static boolean[][][] visited;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		k = sc.nextInt();
		w = sc.nextInt();
		h = sc.nextInt();
		
		board = new int[h][w];
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		visited = new boolean[h][w][k + 1];
		min = bfs(0, 0);
		
		if(min == Integer.MAX_VALUE) System.out.println(-1);
		else System.out.println(min);
	}
	
	static int bfs(int x, int y) {
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(x, y, 0, k));
		visited[x][y][k] = true;
		
		while(!q.isEmpty()) {
			Node now = q.poll();
			if(now.x == h - 1 && now.y == w - 1) return now.cnt;
			
			for(int k=0; k<4; k++) {
				int nx = now.x + dx[k];
				int ny = now.y + dy[k];
				if(nx < 0 || ny < 0 || nx >= h || ny >= w) continue;
				if(!visited[nx][ny][now.k] && board[nx][ny] == 0) {
					visited[nx][ny][now.k] = true;
					q.add(new Node(nx, ny, now.cnt + 1, now.k));
				}
			}
			
			if(now.k > 0) {
				for(int k=0; k<8; k++) {
					int nx = now.x + hdx[k];
					int ny = now.y + hdy[k];
					if(nx < 0 || ny < 0 || nx >= h || ny >= w) continue;
					if(!visited[nx][ny][now.k - 1] && board[nx][ny] == 0) {
						visited[nx][ny][now.k - 1] = true;
						q.add(new Node(nx, ny, now.cnt + 1, now.k - 1));
					}
				}
			}
		}
		
		return min;
	}
	
	public static class Node {
		int x;
		int y;
		int cnt;
		int k;
		
		public Node(int x, int y, int cnt, int k) {
			this.x = x;
			this.y = y;
			this.cnt = cnt;
			this.k = k;
		}
	}
}
