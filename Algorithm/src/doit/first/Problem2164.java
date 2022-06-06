package doit.first;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem2164 {
	public static void main(String[] args) {
		
		/* 큐의 선입선출 문제 */
		/*
			N(카드의 개수) myQueue(카드 저장 자료구조)
			for(N)
			{
				큐에 카드 저장
			}
			while(카드1장까지) {
				맨위 카드 버림 poll()
				카드 버리고 다시 넣기 poll() -> add()
			}
			마지막 카드 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		Queue<Integer> myQueue = new LinkedList<>();
		int N = sc.nextInt();
		for(int i=1; i<=N; i++) {
			myQueue.add(i);
		}
		
		while(myQueue.size() > 1) {
			myQueue.poll();
			myQueue.add(myQueue.poll());
		}
		System.out.println(myQueue.poll());
	
	}

}
