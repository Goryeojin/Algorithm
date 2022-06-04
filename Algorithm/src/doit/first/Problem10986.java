package doit.first;

import java.io.IOException;
import java.util.Scanner;

public class Problem10986 {
	public static void main(String[] args) throws IOException {
		// 나머지 합 구하기
		// 수열의 개수 N
		// 나누어 떨어질 수 M
		// 합 배열 S
		// 같은 나머지의 인덱스 카운트하는 배열 C
		
		// for(i -> 1~N) {
		//	S[i] = S[i-1] + A[i] 합 배열 저장
		//	}
		
		// for(i -> 0~N) {
		//	remainder = S[i] % M 합 배열을 M으로 나눈 값
		// 	if(remainder == 0) 정답 1 증가
		// 	C[remainder]의 값 1 증가
		// }
		
		// for(i -> 0~M) {
		// 	 C[i] (i가 나머지인 인덱스의 개수)에서 2가지를 뽑는 경우의 수를 정답에 더하기
		//		(C[i]개 중 2개를 뽑는 경우의 수 계산 공식 C[i] * (C[i] - 1) / 2
		// }
		// 결과값 출력
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[] S = new long[N];
		long[] C = new long[M];
		long answer = 0;
		
		S[0] = sc.nextInt();
		for(int i=1; i<N; i++) {
			S[i] = S[i-1] + sc.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			int remainder = (int)(S[i] % M);
			
			if(remainder == 0) answer++;
			
			C[remainder]++;
		}
		
		for(int i=0; i<M; i++) {
			if(C[i] > 1) {
				answer = answer + (C[i] * (C[i] - 1) / 2);
			}
		}
		System.out.println(answer);
	}

}
