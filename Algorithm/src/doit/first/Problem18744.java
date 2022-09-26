package doit.first;

import java.util.Arrays;
import java.util.Scanner;

public class Problem18744 {
	
	public static void main(String[] args) {
		
		/*
		 * 데이터 개수 N받기
		 * 배열 A 만들기
		 * for 배열 채우기
		 * 
		 * for(1 ~ n)
		 * 
		 * 		for(i-1 ~ n-1)
		 * 			삽입 위치 찾기
		 */
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] S = new int[N];
		
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		for(int i=1; i<N; i++) {
			
			int insert_point = i;
			int insert_value = A[i];
			
			for(int j=i-1; j>=0; j--) {
				if(A[j] < A[i]) {
					insert_point = j+1;
					break;
				}
				if(j == 0)
					insert_point = 0;
				
			}
			
			for(int j=i; j>insert_point; j--) {
				A[j] = A[j-1];
			}
			A[insert_point] = insert_value;
		}
		S[0] = A[0];
		for(int i=1; i<N; i++) {
			S[i] = S[i-1] + A[i]; 
		}
		int sum = 0;
		for(int i=0; i<N; i++) {
			sum += S[i];
		}
	}
}
