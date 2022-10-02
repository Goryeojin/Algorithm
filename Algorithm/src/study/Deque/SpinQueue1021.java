package study.Deque;

import java.util.LinkedList;
import java.util.Scanner;

public class SpinQueue1021 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> deq = new LinkedList<>();
		int cnt = 0;
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			deq.offer(i);
		}
		
		int[] seq = new int[M];
		
		for(int i=0; i<M; i++) {
			seq[i] = sc.nextInt();
		}
		
		for(int i=0; i<M; i++) {
			int target_idx = deq.indexOf(seq[i]);
			int half_idx;
			
			if(deq.size() % 2 == 0)
				half_idx = deq.size() / 2 - 1;
			else
				half_idx = deq.size() / 2;
			
			if(target_idx <= half_idx) {
				for(int j=0; j<target_idx; j++) {
					deq.offerLast(deq.pollFirst());
					cnt++;
				}
			} else {
				for(int j=0; j<deq.size() - target_idx; j++) {
					deq.offerFirst(deq.pollLast());
					cnt++;
				}
			}
			deq.pollFirst();
			
		}
		System.out.println(cnt);
		
	}
}
