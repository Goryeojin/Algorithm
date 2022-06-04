package doit.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem11660 {
	public static void main(String[] args) throws IOException {
		
		// N(배열크기), M(질의 횟수) 값 저장
		// for(배열 크기만큼 반복) {
		//		for(배열 크기만큼 반복) {
		//			2차원 원본 배열 저장
		//		}
		//	}
		
		// for(N만큼 반복) {
		//		for(N만큼 반복) {
		//			합 배열 저장
		//			D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + A[i][j];
		//		}
		//	}
		
		// for(M만큼 반복) {
		//		질의 계산 및 출력하기
		//		결과 = D[x2][y2] - D[x2][y1-1] - D[x1-1][y2] + D[x1][y1];
		// }
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int A[][] = new int[N+1][N+1];
		for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=N; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int D[][] = new int[N+1][N+1];
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				// 구간 합 구하기
				D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + A[i][j];
			}
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			int result = D[x2][y2] - D[x2][y1-1] - D[x1-1][y2] + D[x1-1][y1-1];
			System.out.println(result);
		}
	}

}
