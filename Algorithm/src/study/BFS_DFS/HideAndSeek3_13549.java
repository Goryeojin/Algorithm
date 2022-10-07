package study.BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class HideAndSeek3_13549 {
	static int N, K;
	static int[] vis = new int[100001];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		K = Integer.parseInt(input[1]);
		
		int res = BFS();
		System.out.println(res);
	}
	
	static int BFS() {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {N, 1});
		vis[N] = 1;
		
		while(!q.isEmpty()) {
			int[] now = q.poll();
			
			if(now[0] + 1 <= 100000) {
				if(vis[now[0] + 1] == 0 || vis[now[0] + 1] > now[1] + 1) { //현재+1 시간보다 저장되어 있는 다음칸 시간이 더 크면 더 작은 값 저장
					vis[now[0] + 1] = now[1] + 1;
					q.add(new int[] {now[0] + 1, now[1] + 1});
				}
			}
			if(now[0] - 1 >= 0) {
				if(vis[now[0] - 1] == 0 || vis[now[0] - 1] > now[1] + 1) {
					vis[now[0] - 1] = now[1] + 1;
					q.add(new int[] {now[0] - 1, now[1] + 1});
				}
				
			}
			if(now[0] * 2 <= 100000) {
				if(vis[now[0] * 2] == 0 || vis[now[0] * 2] > now[1]) {
					vis[now[0] * 2] = now[1];
					q.add(new int[] {now[0] * 2, now[1]});
				}
			}
		}
		
		return vis[K] - 1;
	}
}
