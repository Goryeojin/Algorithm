package study.BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Term9466 {
	
	static int n, cnt;
	static int[] board;
	static boolean[] visited, finished;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			n = Integer.parseInt(br.readLine());
			board = new int[n + 1];
			visited = new boolean[n + 1];
			finished = new boolean[n + 1];
			cnt = 0;
			
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=n; j++) {
				board[j] = Integer.parseInt(st.nextToken());
			}
			for(int j=1; j<=n; j++) {
				if(visited[j]) continue;
				dfs(j);
			}
			System.out.println(n - cnt);
		}
	}
	
	static void dfs(int now) {
		visited[now] = true;
		int nxt = board[now];
		
		if(!visited[nxt]) dfs(nxt);
		else {
			if(!finished[nxt]) {
				cnt++;
				while(nxt != now) {
					cnt++;
					nxt = board[nxt];
				}
			}
		}
		finished[now] = true;
	}
}
