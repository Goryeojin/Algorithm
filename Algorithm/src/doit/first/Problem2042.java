package doit.first;

import java.util.Scanner;

public class Problem2042 {
	public static void main(String[] args) {
		
		// 구간 합 구하기
		
		// 수열의 개수 N, 수열 변경 횟수 M, 구간의 합 구하는 횟수 K
		// for(i -> 0~N) {
		//		원본 배열 A
		// }
		// for(i -> 0~M+K) {
		//		a b c 입력받아서
		//		if(a == 1) A[b] = c;
		//		if(a == 2) {
		//			for(int i=b; i<c; i++){
		//				sum 구간합 구하기
		//			}
		//		}
		// }
		// 구간합 출력
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		
		int[] A = new int[N];
		
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		for(int i=0; i<M+K; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a==1) A[b-1] = c;
			if(a==2) {
				for(int j=b-1; j<=c-1; j++) {
					sum += A[j];
				}
				System.out.println(sum);
			}
			sum = 0;
		}
		
	}

}
