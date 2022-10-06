package study.BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class HideAndSeek1697 {
	
	static int N, K;
	static int[] vis = new int[100001];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		K = Integer.parseInt(input[1]);
		
		int res = BFS(N);
		System.out.println(res);
	}
	
	private static int BFS(int idx) {
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(idx);
		int now = 0;
		vis[idx] = 1;
		
		while(!queue.isEmpty()) {
			now = queue.poll();
			
			if(now == K) return vis[now] - 1;
			if(now - 1 >= 0 && vis[now - 1] == 0) {
				vis[now - 1] = vis[now] + 1;
				queue.add(now - 1);
			}
			if(now + 1 <= 100000 && vis[now + 1] == 0) {
				vis[now + 1] = vis[now] + 1;
				queue.add(now + 1);
			}
			if(2 * now <= 100000 && vis[2 * now] == 0) {
				vis[2 * now] = vis[now] + 1;
				queue.add(2 * now);
			}
		}
		return -1;
	}
}
