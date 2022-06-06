package doit.first;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Problem17298 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 스택이용한 오큰수 문제
		
		/*
			N(수열 개수) A[](수열 배열) ans[](정답 배열)
			수열 배열 채우기
			최초 스택 초기화하기
			for(N) {
				while(스택비어있지않고, 현재수열값이 top수열보다 클때까지){
					pop()
					정답 배열에 오큰수를 현재 수열로 저장하기
				}
				현재 수열을 스택에 push()
			}
			while(스택이 빌떄까지) {
				스택에 있는 인덱스의 정답 배열에 -1 저장
			}
			정답 배열 출력
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];	// 수열 배열 생성
		int[] ans = new int[N];	// 정답 배열 생성
		
		String[] str = br.readLine().split(" ");
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(str[i]);
		}
		
		Stack<Integer> stack = new Stack<>();
		stack.push(0);	// 처음에는 스택이 항상 비어있으므로 최초 값을 push해 초기화
		
		for(int i=1; i<N; i++) {
			// 스택이 비어 있지 않고 현재 수열이 top 인덱스가 가리키는 수열보다 클 경우
			while(!stack.isEmpty() && A[stack.peek()] < A[i]) {
				ans[stack.pop()] = A[i];
			}
			stack.push(i);
		}
		
		while(!stack.empty()) {
			// 반복문을 돌고 나왔는데 스택이 비어 있지 않았다면
			ans[stack.pop()] = -1;
			// 스택에 쌓인 index에 -1을 넣고
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0; i<N; i++) {
			bw.write(ans[i] + " ");
		}
		bw.write("\n");
		bw.flush();
	}

}
