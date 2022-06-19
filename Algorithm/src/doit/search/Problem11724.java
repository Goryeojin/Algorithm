package doit.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Problem11724 {
	/*
	 * DFS�� ���� ��� ���� ã��
	
	n(��� ����) m(���� ����)
	A(�׷��� ������ ���� ���� ����Ʈ)
	visited(�湮 ��� ���� �迭)
	for(n�� ������ŭ �ݺ��ϱ�) {
		A ���� ����Ʈ�� �� ArrayList �ʱ�ȭ�ϱ�
	}
	for(m) {
		A ���� ����Ʈ�� �׷��� ������ �����ϱ�
	}
	for(n) {
		if(�湮 ���� ��尡 �ִٸ�) {
			���� ��� ����++
			DFS �����ϱ�
		}
	}
	// DFS �����ϱ�
	DFS {
		if(���� ��� == �湮 ���) return;
		visited �迭�� ���� ��� �湮 ����ϱ�
		���� ����� ���� ��� �� �湮���� ���� ���� DFS �����ϱ�(��� �Լ� ����)
	}
	 */
	
	public static ArrayList<Integer>[] A;
	public static boolean visited[];
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		A = new ArrayList[N + 1];
		visited = new boolean[N + 1];
		
		for(int i=1; i<N+1; i++) {
			A[i] = new ArrayList<Integer>();
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int S = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			A[S].add(E);
			A[E].add(S);
		}
		int count = 0;
		for(int i=1; i<N+1; i++) {
			if(!visited[i]) {
				count++;
				DFS(i);
			}
		}
		System.out.println(count);
	}
	
	private static void DFS(int v) {
		if(visited[v]) {
			return;
		}
		
		visited[v] = true;
		for(int i : A[v]) {
			if(visited[i] == false) {
				DFS(i);
			}
		}
	}

}
