package study.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumOfPartialSequences1182 {
	public static int[] arr;
	public static int N, S;
	public static int cnt;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(0, 0);
		if(S == 0) cnt--;
		System.out.println(cnt);
	}
	
	public static void dfs(int depth, int tot) {
		if(depth == N) {
			if(tot == S) cnt++;
			return;
		}
		
		dfs(depth + 1, tot);
		dfs(depth + 1, tot + arr[depth]);
	}
}
