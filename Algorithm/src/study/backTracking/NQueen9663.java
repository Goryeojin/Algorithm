package study.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NQueen9663 {
	
	public static int N, cnt;
	public static int[] board;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		board = new int[N];
		
		dfs(0);
		System.out.println(cnt);
	}
	
	public static void dfs(int depth) {
		
		if(depth == N) {
			cnt++;
			return;
		}
		for(int i=0; i<N; i++) {
			board[depth] = i;
			if(promising(depth)) {
				dfs(depth + 1);
			}
		}
	}
	
	public static boolean promising(int depth) {
		for(int i=0; i<depth; i++) {
			if(board[depth] == board[i]) {
				return false;
			}
			else if(Math.abs(depth - i) == Math.abs(board[depth] - board[i])) {
				return false;
			}
		}
		return true;
	}
}
