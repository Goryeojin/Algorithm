package study.BFS_DFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BreakWall2206 {
	
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] map, visit;
	static int N, M, ans;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		map = new int[N][M];
		visit = new int[N][M];
		sc.nextLine();
		for(int i=0; i<N; i++) {
			String[] str = sc.nextLine().split("");
			for(int j=0; j<M; j++) {
				map[i][j] = Integer.parseInt(str[j]);
				visit[i][j] = Integer.MAX_VALUE;
			}
		}
		ans = -1;
		
		bfs(0, 0);
		
		System.out.println(ans);
	}
	
	public static void bfs(int x, int y) {
		Queue<Place> q = new LinkedList<>();
		
		q.add(new Place(x, y, 1, 0));
		visit[x][y] = 0;
		
		while(!q.isEmpty()) {
			Place p = q.poll();
			
			if(p.x == N-1 && p.y == M-1) {
				ans = p.dis;
				break;
			}
			
			for(int k=0; k<4; k++) {
				int nx = p.x + dx[k];
				int ny = p.y + dy[k];
				
				if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
				if(visit[nx][ny] <= p.drill) continue;
				if(map[nx][ny] == 0) {
					visit[nx][ny] = p.drill;
					q.add(new Place(nx, ny, p.dis+1, p.drill));
				} else {
					if(p.drill == 0) {
						visit[nx][ny] = p.drill + 1;
						q.add(new Place(nx, ny, p.dis+1, p.drill+1));
					}
				}
			}
		}
	}
}

class Place {
	int x;
	int y;
	int dis;
	int drill;
	
	Place(int x, int y, int dis, int drill){
		this.x = x;
		this.y = y;
		this.dis = dis;
		this.drill = drill;
	}
}
