package doit.search;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem13023 {
	/*
	N(노드 개수) M(에지 개수)
	A(그래프 데이터 저장 인접 리스트)
	visited(방문 기록 저장 배열)
	arrive(도착 확인 변수)
	for(N) {
		A 인접 리스트의 각 ArrayList 초기화하기
	}
	for(M) {
		A 인접 리스트에 그래프 데이터 저장하기
	}
	for(N) {
		각 노드마다 DFS 실행하기
		if(arrive) 반복문 종료 // depth가 5에 도달한 적이 있다면
	}
	if(arrive) 1 출력
	else 0 출력
	
	// DFS 구현하기
	DFS {
		if(깊이가 5 || arrive) {
			arrive = true;
			함수 종료
		}
		방문 배열에 현재 노드 방문 기록하기
		현재 노드의 연결 노드 중 방문하지 않은 노드로 DFS 실행하기(호출마다 depth는 1씩 증가)
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
