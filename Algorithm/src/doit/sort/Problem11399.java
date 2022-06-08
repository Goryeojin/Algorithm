package doit.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem11399 {
	public static void main(String[] args) throws IOException {
		
		// 선택 정렬으로 자릿수 정렬
		/*
			N 자릿수
			A 배열
			S 합정렬
			for(N) 배열 저장
			for(N)
				삽입위치, 값 선언
				for(i-1 뒤에서 반복)
					현재 범위에서 삽입 위치 찾기
				}
				for(i ~ 삽입위치 뒤에서 반복)
					한칸씩 뒤로 밀기
				}
				삽입 위치에 값 삽입
			for(N) A 배열로 S 합 배열
			합 배열값 모두 합해 출력
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		int[] S = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=1; i<N; i++) {
			int insert_point = i;
			int insert_value = A[i];
			
			for(int j=i-1; j>=0; j--) {
				if(A[j] < A[i]) {
					insert_point = j+1;
					break;
				}
				if(j == 0) {
					insert_point = 0;
				}
			}
			for(int j=i; j>insert_point; j--) {
				A[j] = A[j-1];
			}
			A[insert_point] = insert_value;
		}
		S[0] = A[0];
		int sum = S[0];
		for(int i=1; i<N; i++) {
			S[i] = S[i-1] + A[i];
			sum += S[i];
		}
		System.out.println(sum);
	}

}
