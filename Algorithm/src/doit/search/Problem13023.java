package doit.search;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem13023 {
	/*
	N(��� ����) M(���� ����)
	A(�׷��� ������ ���� ���� ����Ʈ)
	visited(�湮 ��� ���� �迭)
	arrive(���� Ȯ�� ����)
	for(N) {
		A ���� ����Ʈ�� �� ArrayList �ʱ�ȭ�ϱ�
	}
	for(M) {
		A ���� ����Ʈ�� �׷��� ������ �����ϱ�
	}
	for(N) {
		�� ��帶�� DFS �����ϱ�
		if(arrive) �ݺ��� ���� // depth�� 5�� ������ ���� �ִٸ�
	}
	if(arrive) 1 ���
	else 0 ���
	
	// DFS �����ϱ�
	DFS {
		if(���̰� 5 || arrive) {
			arrive = true;
			�Լ� ����
		}
		�湮 �迭�� ���� ��� �湮 ����ϱ�
		���� ����� ���� ��� �� �湮���� ���� ���� DFS �����ϱ�(ȣ�⸶�� depth�� 1�� ����)
	}
	 */
	
	static boolean visited[];
	static ArrayList<Integer>[] A;
	static boolean arrive;
	
	public static void main(String[] args) {
		
		int N;
		int M;
		arrive = false;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		A = new ArrayList[N];
		visited = new boolean[N];
		
		for(int i=0; i<N; i++) {
			A[i] = new ArrayList<Integer>();
		}
		for(int i=0; i<M; i++) {
			int S = sc.nextInt();
			int E = sc.nextInt();
			A[S].add(E);
			A[E].add(S);
		}
		for(int i=0; i<N; i++) {
			DFS(i, 1);
			if(arrive) break;
		}
		if(arrive)
			System.out.println("1");
		else
			System.out.println("0");
		
	}
	
	public static void DFS(int now, int depth) {
		if(depth == 5 || arrive) {
			arrive = true;
			return;
		}
		
		visited[now] = true;
		for(int i : A[now]) {
			if(!visited[i]) {
				DFS(i, depth + 1);
			}
		}
		visited[now] = false;
	}
	

}
