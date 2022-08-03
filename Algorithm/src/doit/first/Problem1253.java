package doit.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1253 {
	public static void main(String[] args) throws IOException {
		
		// N 수의 개수
		// 배열 선언 for(N) 배열 저장
		// 배열 정렬
		// for(N) {
		//	변수 초기화(찾을값 k, 포인터 i, 포인터 j)
		// 	while(i<j) {
		//		if(A[i]+A[j] == 찾는 값)
		//			두 포인터 i,j가 아닐 때 결괏값 반영 및 while문 종료
		//			두 포인터 i,j가 k일 때 포인터 변경 및 계속 수행
		//			
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		long[] A = new long[N];
		
		int result = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			A[i] = Long.parseLong(st.nextToken());
		}
		
		Arrays.sort(A);
		
		for(int k=0; k<N; k++) {
			long find = A[k];
			int i = 0;
			int j = N - 1;
			
			while(i < j) {
				if(A[i] + A[j] == find) {
					// find는 서로 다른 두 수의 합이어야 함을 체크
					if(i != k && j != k) {
						result++;
						break;
					} else if(i == k) {
						i++;
					} else if(j == k) {
						j--;
					}
				} else if(A[i] + A[j] < find) {
					i++;
				} else {
					j--;
				}
			}
		}
		
		System.out.println(result);
		br.close();
	}

}
