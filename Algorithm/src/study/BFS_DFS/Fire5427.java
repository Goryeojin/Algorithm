package study.BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Fire5427 {
	
	static char[][] board;
	static int[][] fire, man;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int w, h;
	
	static Queue<int[]> que1, que2;
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			
			board = new char[h][w];
			fire = new int[h][w];
			man = new int[h][w];
			
			for(int k=0; k<h; k++) {
				st = new StringTokenizer(br.readLine());
				String str = st.nextToken();
				for(int j=0; j<w; j++) {
					board[k][j] = str.charAt(j);
					fire[k][j] = -1;
					man[k][j] = -1;
				}
			}
			fill();
			fire_bfs();
			man_bfs();
		}

	}
	
	private static void fill() {
		que1 = new LinkedList<>();
		que2 = new LinkedList<>();
		
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++) {
				if(board[i][j] == '*') {
					que1.add(new int[] {i, j});
					fire[i][j] = 0;
				} else if(board[i][j] == '@') {
					que2.add(new int[] {i, j});
					man[i][j] = 0;
				}
			}
		}
	}
	
	private static void fire_bfs() {
		// 불에 대한 BFS
		while(!que1.isEmpty()) {
			int[] now = que1.poll();
			for(int k=0; k<4; k++) {
				int x = now[0] + dx[k];
				int y = now[1] + dy[k];
				if(x < 0 || x >= h || y < 0 || y >= w) continue;
				if(fire[x][y] >= 0 || board[x][y] == '#') continue;
				fire[x][y] = fire[now[0]][now[1]] + 1;
				que1.add(new int[] {x, y});
			}
		}
	}
	
	private static void man_bfs() {
		// 지훈이에 대한 BFS
		while(!que2.isEmpty()) {
			int[] now = que2.poll();
			for(int k=0; k<4; k++) {
				int x = now[0] + dx[k];
				int y = now[1] + dy[k];
				if(x < 0 || x >= h || y < 0 || y >= w) {
					System.out.println(man[now[0]][now[1]] + 1);
					return;
				}
				if(man[x][y] >= 0 || board[x][y] == '#') continue;
				if(fire[x][y] != -1 && fire[x][y] <= man[now[0]][now[1]] + 1)
					continue;
				man[x][y] = man[now[0]][now[1]] + 1;
				que2.add(new int[] {x, y});
			}
		}
		System.out.println("IMPOSSIBLE");
	}
}
