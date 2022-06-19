package doit.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem10989 {
	/*
	 * 기수 정렬로 오름차순 정렬
	N(정렬할 수 개수)
	A(정렬할 배열 선언하기)
	for(N) {
		A 배열 저장
	}
	기수 정렬 함수 수행
	정렬된 A 배열 출력
	
	// 기수 정렬 함수 구현
	// 변수 선언 부
	bucket(현재 자릿수들의 분포를 합 배열의 형태로 알려주는 배열)
	ex : bucket[4] -> 현재 기준 자릿값이 0~4까지 몇 개의 데이터가 있는지 저장하기
	output(임시 정렬을 위한 배열)
	jarisu(현재 자릿수를 표현하는 수)
	// 로직 부분
	while(최대 자릿수만큼 반복)
	{
		현재 기준 자릿수를 기준으로 A 배열 데이터를 bucket에 count
		합 배열 공식으로 bucket을 합 배열 형태로 변경하기
		for(N)
		{
			bucket값을 이용해 현재 기준 자릿수로 데이터를 정렬하기
			output 배열에 저장하기
		}
		for(N)
		{
			다음 자릿수 이동을 위해 A 배열에 output 데이터 저장하기
		}
		jarisu *= 10
	 */
	
	public static int[] A;
	public static long result;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		
	}
	
	public static void Radix_Sort(int[] A, int max_size) {
		int[] output = new int[A.length];
		int jarisu = 1;
		int count = 0;
		while(count != max_size) {		// 최대 자릿수만큼 반복하기
			int[] bucket = new int[10];
			for(int i=0; i<A.length; i++) {
				bucket[(A[i] / jarisu) % 10]++;	// 일의 자리부터 시작하기
			}
			for(int i=1; i<10; i++) {	// 합 배열을 이용해 index 계산하기
				bucket[i] += bucket[i - 1];
			}
			for(int i=A.length-1; i>=0; i--) {	// 현재 자릿수를 기준으로 정렬하기
				output[bucket[(A[i] / jarisu % 10)] - 1] = A[i];
				bucket[(A[i] / jarisu) % 10]--;
			}
			for(int i=0; i<A.length; i++) {
				// 다음 자릿수를 이동하기 위해 현재 자릿수 기준 정렬 데이터 저장하기
				A[i] = output[i];
			}
			jarisu *= 10;	// 자릿수 증가시키기
			count++;
		}
	}
}
