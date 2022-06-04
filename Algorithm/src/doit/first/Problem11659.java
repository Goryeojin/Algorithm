package doit.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem11659 {
	public static void main(String[] args) throws IOException {
		
		// N개의 수를 입력받음과 동시에 합 배열 생성
		// S[i] = S[i-1] + A[i]
		// 구간 i~j가 정해지면 구간 합 공식으로 정답 출력
		// S[j] - S[i-1]
		
		// suNo(숫자 개수), quizNo(질의 개수) 저장하기
		// for(숫자 개수만큼 반복하기) {
		//	합 배열 생성하기(S[i] = S[i-1] + A[i]
		// }
		// for(질의 개수만큼 반복하기) {
		//	질의 범위 받기(i~j)
		//	구간 합 출력하기(S[j] - S[i-1])
		// }
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int sNum = Integer.parseInt(st.nextToken());
		int quizNum = Integer.parseInt(st.nextToken());
		
		long[] S = new long[sNum + 1];
		st = new StringTokenizer(br.readLine());
		
		for(int i=1; i<=sNum; i++) {
			S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
		}
		
		for(int q=0; q<quizNum; q++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			System.out.println(S[j] - S[i-1]);
		}
	}

}
