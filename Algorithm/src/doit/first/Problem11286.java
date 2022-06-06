package doit.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Problem11286 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/* 우선순위 큐 만들어 절대값 힙 구하기
		 * 
			N 질의 요청 개수
			우선순위 큐 선언
			- 절댓값 기준으로 정렬되도록
			- 절댓값이 같으면 음수 우선 정렬
			for(N) {
				요청 0일 때 : 큐가 비어 있다면 0, 아니면 큐의 front값 출력 poll()
				요청 1이상 : 새로운 데이터를 우선순위 큐에 더하기 add()
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1, o2) -> {
			int first_abs = Math.abs(o1);
			int second_abs = Math.abs(o2);
			if(first_abs == second_abs)
				return o1 > o2 ? 1 : -1;		// 절댓값 같으면 음수 우선 정렬
			else
				return first_abs - second_abs;	// 절댓값 기준으로 정렬
		});
		for(int i=0; i<N; i++) {
			int request = Integer.parseInt(br.readLine());
			if(request == 0) {
				if(myQueue.isEmpty()) {
					System.out.println("0");
				} else {
					System.out.println(myQueue.poll());
				}
			} else {
				myQueue.add(request);
			}
		}
		
		
	}

}
