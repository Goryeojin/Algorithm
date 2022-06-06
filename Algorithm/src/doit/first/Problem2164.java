package doit.first;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem2164 {
	public static void main(String[] args) {
		
		/* ť�� ���Լ��� ���� */
		/*
			N(ī���� ����) myQueue(ī�� ���� �ڷᱸ��)
			for(N)
			{
				ť�� ī�� ����
			}
			while(ī��1�����) {
				���� ī�� ���� poll()
				ī�� ������ �ٽ� �ֱ� poll() -> add()
			}
			������ ī�� ���
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
