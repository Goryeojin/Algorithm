package doit.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem1260 {
	/*
	 * DFS�� BFS�� ��� Ž�� ��� ����
	
	N(��� ����) M(���� ����) Start(������)
	A(�׷��� ������ ���� ���� ����Ʈ) visited(�湮 ��� ���� �迭)
	for(N)
		A ���� ����Ʈ�� �� ArrayList �ʱ�ȭ�ϱ�
	for(M)
		A ���� ����Ʈ�� �׷��� ������ �����ϱ�
	
	// �湮�� �� �ִ� ��尡 ���� ���� ��쿡�� ��ȣ�� ���� ���� ���� �湮�ϱ� ���� �����ϱ�
	for(N)
		�� ���� ���õ� ������ �����ϱ�
	visited �迭 �ʱ�ȭ�ϱ�
	DFS(Start) �����ϱ�
	visited �迭 �ʱ�ȭ�ϱ�
	BFS(Start) �����ϱ�
	
	DFS {
		���� ��� ����ϱ�
		visited �迭�� ���� ��� �湮 ����ϱ�
		���� ����� ���� ��� �� �湮���� ���� ���� DFS �����ϱ�(��� �Լ� ����)
	}
	
	BFS {
		ť �ڷᱸ���� ���� ��� �����ϱ�(add ����)
		visited �迭�� ���� ��� �湮 ����ϱ�
		while(ť�� ��� ���� ������) {
			ť���� ��� �����͸� ��������(poll����)
			������ ��� ����ϱ�
			���� ����� ���� ��� �� �̹湮 ��带 ť�� ����(add �����ϰ� �湮 �迭�� ����ϱ�)
		}
	}
	 */
	
	static boolean visited[];
	static ArrayList<Integer>[] A;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int start = sc.nextInt();
		A = new ArrayList[N + 1];
		for(int i=1; i<=N; i++) {
			A[i] = new ArrayList<Integer>();
		}
		for(int i=0; i<M; i++) {
			int S = sc.nextInt();
			int E = sc.nextInt();
			A[S].add(E);
			A[E].add(S);
		}
		
		for(int i=1; i<=N; i++) {
			Collections.sort(A[i]);
		}
		
		visited = new boolean[N+1];
		DFS(start);
		System.out.println();
		visited = new boolean[N+1];
		BFS(start);
		System.out.println();
	}
	
	public static void DFS(int node) {
		System.out.print(node + " ");
		visited[node] = true;
		for(int i : A[node]) {
			if(!visited[i]) {
				DFS(i);
			}
		}
	}
	
	public static void BFS(int node) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(node);
		visited[node] = true;
		
		while(!queue.isEmpty()) {
			int now_node = queue.poll();
			System.out.print(now_node + " ");
			for(int i : A[now_node]) {
				if(!visited[i]) {
					visited[i] = true;
					queue.add(i);
				}
			}
		}
	}
}
