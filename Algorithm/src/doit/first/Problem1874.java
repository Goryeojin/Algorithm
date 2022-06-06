package doit.first;

import java.util.Scanner;
import java.util.Stack;

public class Problem1874 {
	/* 스택과 큐 이용한 스택수열 */
	/*
		N(수열 개수) A[](수열 배열)
		수열 배열 채우기
		for(N만큼)
		{
			if(현재수열값 >= 오름차순 자연수){
				while(값 같을떄까지){
					push()
					+ 저장
				}
				pop()
				-저장
			} else(현재 수열값 < 오름차순 자연수){
				pop()
				- 저장
				if(pop값 > 수열의 수) NO 출력
				else - 저장
			}
		}
		if(NO값 출력 안했으면) 저장값 출력
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		Stack<Integer> stack = new Stack<>();
		StringBuffer bf = new StringBuffer();
		
		int num = 1; // 오름차순 수
		boolean result = true;
		
		for(int i=0; i<A.length; i++) {
			
			int su = A[i];	// 현재 수열의 수
			if(su >= num) {	// 현재 수열값 >= 오름차순 자연수 : 값이 같아질 때까지 push() 수행
				
				while(su >= num) {
					stack.push(num++);
					bf.append("+\n");
				}
				stack.pop();
				bf.append("-\n");
				
			} else {		// 현재 수열값 < 오름차순 자연수 : pop()을 수행해 수열 원소를 꺼냄
				int n = stack.pop();
				// 스택의 가장 위의 수가 만들어야 하는 수열의 수보다 크면 수열을 출력할 수 없음
				if(n>su) {
					
					System.out.println("NO");
					result = false;
					break;
				} else {
					bf.append("-\n");
				}
			}
		}
		if(result) System.out.println(bf.toString());
		
	}

}
