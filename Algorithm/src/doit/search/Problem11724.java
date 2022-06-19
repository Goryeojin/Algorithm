package doit.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Problem11724 {
	/*
	 * DFS로 연결 요소 개수 찾기
	
	n(노드 개수) m(에지 개수)
	A(그래프 데이터 저장 인접 리스트)
	visited(방문 기록 저장 배열)
	for(n의 개수만큼 반복하기) {
		A 인접 리스트의 각 ArrayList 초기화하기
	}
	for(m) {
		A 인접 리스트에 그래프 데이터 저장하기
	}
	for(n) {
		if(방문 안한 노드가 있다면) {
			연결 요소 개수++
			DFS 실행하기
		}
	}
	// DFS 구현하기
	DFS {
		if(현재 노드 == 방문 노드) return;
		visited 배열에 현재 노드 방문 기록하기
		현재 노드의 연결 노드 중 방문하지 않은 노드로 DFS 실행하기(재귀 함수 형태)
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
