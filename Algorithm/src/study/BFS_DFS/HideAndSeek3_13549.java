package study.BFS_DFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HideAndSeek3_13549 {
	static int N, M;
	static int[] vis = new int[100001];
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		K = Integer.parseInt(input[1]);
		
		int res = BFS(N);
		System.out.println(res);
	}
}
