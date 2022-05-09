package backjon.step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem4344 {
	/*
	첫째 줄에는 테스트 케이스의 개수 C가 주어진다.

	둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 
	이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
	각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
	
	5
	5 50 50 70 80 100
	7 100 95 90 80 70 60 50
	3 70 90 80
	3 70 90 81
	9 100 99 98 97 96 95 94 93 91
	
	40.000%
	57.143%
	33.333%
	66.667%
	55.556%
	*/
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int C = Integer.parseInt(br.readLine());
		int arr[];
		
		StringTokenizer st;
		
		for(int i=0; i<C; i++) {
			
			st = new StringTokenizer(br.readLine(), " "); 	// 학생 수 및 성적 입력
			
			int N = Integer.parseInt(st.nextToken());		// 학생 수
			arr = new int[N];
			
			int sum = 0;	// 성적 누적 합 변수
			
			for(int j=0; j<N; j++) {	// 성적 저장
				int val = Integer.parseInt(st.nextToken());
				arr[j] = val;
				sum += val;
			}
			
			double avg = (double)sum / N;
			
			int count = 0;	// 평균 넘는 학생 수 변수
			
			for(int j=0; j<N; j++) {
				if(arr[j] > avg) {
					count ++;
				}
			}
			
			System.out.printf("%.3f%%\n", ((double)count/N)*100);
			
		}
	}
}
