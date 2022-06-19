package doit.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem1167 {
	/*
	 * BFS로 트리의 지름 구하기
	
	N(노드 개수) A(그래프 데이터 저장 인접 리스트)	// ArrayList<Edge>[] 형태로 선언
	visited(방문 기록 저장 배열) distance(거리 저장 배열)
	for(N) {
		A 인접 리스트의 각 ArrayList 초기화하기
	}
	for(M) {
		A 인접 리스트의 그래프 데이터 저장하기
	}
	visited 배열 초기화하기
	distance 배열 초기화하기
	BFS(임의의 점을 시작점으로) 실행하기
	distance 배열에서 가장 큰 값을 지니고 있는 노드를 시작점으로 지정하기
	visited 배열 초기화하기
	distance 배열 초기화하기
	BFS(새로운 시작점으로) 실행하기
	distance 배열에서 가장 큰 수를 정답으로 출력하기
	BFS {
		큐 자료구조에 시작 노드 삽입하기(add)
		visited 배열에 현재 노드 방문 기록하기
		while(큐가 비어 있을 때까지) {
			큐에서 노드 데이터를 가져오기(poll)
			가져온 노드 출력하기
			현재 노드의 연결 노드 중 방문하지 않은 노드로
			큐에 데이터 삽입(add) 하고 visited 배열에 방문 기록하기
			그리고 현재 노드의 거리 + 에지의 가중치로 방문하지 않은 노드 거리 배열 업데이트하기
		}
	}
	Edge {
		e(목적지 노드), value(에지의 가중치)
	}
	 */
	
	static boolean visited[];
	static int[] distance;
	static ArrayList<Edge>[] A;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		A = new ArrayList[N+1];
		for(int i=1; i<=N; i++) {
			A[i] = new ArrayList<Edge>();
		}
		for(int i=0; i<N; i++) {
			int S = sc.nextInt();
			while(true) {
				int E = sc.nextInt();
				if(E == -1)
					break;
				int V = sc.nextInt();
				A[S].add(new Edge(E, V));
			}
		}
		distance = new int[N+1];
		visited = new boolean[N+1];
		BFS(1);
		int max = 1;
		for(int i=2; i<=N; i++) {
			if(distance[max] < distance[i])
				max = i;
		}
		distance = new int[N+1];
		visited = new boolean[N+1];
		BFS(max);
		Arrays.sort(distance);
		System.out.println(distance[N]);
	}
	
	private static void BFS(int index) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(index);
		visited[index] = true;
		while(!queue.isEmpty()) {
			int now_node = queue.poll();
			for(Edge i : A[now_node]) {
				int e = i.e;
				int v = i.value;
				if(!visited[e]) {
					visited[e] = true;
					queue.add(e);
					distance[e] = distance[now_node] + v;
				}
			}
		}
	}

}
	class Edge{
		int e;
		int value;
		public Edge(int e, int value) {
			this.e = e;
			this.value = value;
		}
	}
