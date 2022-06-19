package doit.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem1260 {
	/*
	 * DFS와 BFS로 노드 탐색 결과 수행
	
	N(노드 개수) M(에지 개수) Start(시작점)
	A(그래프 데이터 저장 인접 리스트) visited(방문 기록 저장 배열)
	for(N)
		A 인접 리스트의 각 ArrayList 초기화하기
	for(M)
		A 인접 리스트에 그래프 데이터 저장하기
	
	// 방문할 수 있는 노드가 여러 개일 경우에는 번호가 작은 것을 먼저 방문하기 위해 정렬하기
	for(N)
		각 노드와 관련된 에지를 정렬하기
	visited 배열 초기화하기
	DFS(Start) 실행하기
	visited 배열 초기화하기
	BFS(Start) 실행하기
	
	DFS {
		현재 노드 출력하기
		visited 배열에 현재 노드 방문 기록하기
		현재 노드의 연결 노드 중 방문하지 않은 노드로 DFS 실행하기(재귀 함수 형태)
	}
	
	BFS {
		큐 자료구조에 시작 노드 삽입하기(add 연산)
		visited 배열에 현재 노드 방문 기록하기
		while(큐가 비어 있을 때까지) {
			큐에서 노드 데이터를 가져오기(poll연산)
			가져온 노드 출력하기
			현재 노드의 연결 노드 중 미방문 노드를 큐에 삽입(add 연산하고 방문 배열에 기록하기)
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
