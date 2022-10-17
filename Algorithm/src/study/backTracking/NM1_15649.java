package study.backTracking;

import java.util.Scanner;

public class NM1_15649 {
	
	public static int N, M;
	public static int[] arr;
	public static boolean[] visited;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new int[M];
		visited = new boolean[N];
		
		dfs(0);
		System.out.println(sb);
	}
	
	public static void dfs(int depth) {
		if(depth == M) {
			for(int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		for(int i=0; i<N; i++) {
			if(!visited[i]) {
				arr[depth] = i + 1;
				visited[i] = true;
				dfs(depth + 1);
				visited[i] = false;
			}
		}
	}
}
