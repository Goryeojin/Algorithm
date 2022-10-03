package study.BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Fire4179 {
	
	static char[][] board;
	static int[][] fire;
	static int[][] jihun;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int R, C;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		board = new char[R][C];
		fire = new int[R][C];
		jihun = new int[R][C];
		
		for(int i=0; i<R; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			for(int j=0; j<C; j++) {
				board[i][j] = str.charAt(j);
				fire[i][j] = -1;
				jihun[i][j] = -1;
			}
		}
		
		Queue<int[]> que1 = new LinkedList<>();
		Queue<int[]> que2 = new LinkedList<>();
		
		for(int i=0; i<R; i++) {
			for(int j=0; j<C; j++) {
				if(board[i][j] == 'F') {
					que1.add(new int[] {i, j});
					fire[i][j] = 0;
				} else if(board[i][j] == 'J') {
					que2.add(new int[] {i, j});
					jihun[i][j] = 0;
				}
			}
		}
		
		// 불에 대한 BFS
		while(!que1.isEmpty()) {
			int[] now = que1.poll();
			for(int k=0; k<4; k++) {
				int x = now[0] + dx[k];
				int y = now[1] + dy[k];
				if(x < 0 || x >= R || y < 0 || y >= C) continue;
				if(fire[x][y] >= 0 || board[x][y] == '#') continue;
				fire[x][y] = fire[now[0]][now[1]] + 1;
				que1.add(new int[] {x, y});
			}
		}
		// 지훈이에 대한 BFS
		while(!que2.isEmpty()) {
			int[] now = que2.poll();
			for(int k=0; k<4; k++) {
				int x = now[0] + dx[k];
				int y = now[1] + dy[k];
				if(x < 0 || x >= R || y < 0 || y >= C) {
					System.out.println(jihun[now[0]][now[1]] + 1);
					return;
				}
				if(jihun[x][y] >= 0 || board[x][y] == '#') continue;
				if(fire[x][y] != -1 && fire[x][y] <= jihun[now[0]][now[1]] + 1)
					continue;
				jihun[x][y] = jihun[now[0]][now[1]] + 1;
				que2.add(new int[] {x, y});
			}
		}
		System.out.println("IMPOSSIBLE");
	}
}
