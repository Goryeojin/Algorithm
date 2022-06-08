package doit.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem1377 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 버블 정렬
		/*
			N(데이터 개수)
			A(데이터 배열(클래스데이터))
			for(N)
			{
				배열 저장
			}
			A 배열 정렬
			for(N)
			{
				A[i] 정렬 전 index - 정렬 후 index 계싼의 최댓값 찾아 저장
			}
			최댓값 + 1 정답 출력
			
			별도 클래스 선언
			mData(데이터표현)
			{
				index, value를 가지며
				value 기준 오름차순 정렬 함수 Comparable 구현
			}
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		mData[] A = new mData[N];
		for(int i=0; i<N; i++) {
			A[i] = new mData(Integer.parseInt(br.readLine()), i);
			
		}
		Arrays.sort(A);
		int max = 0;
		
		for(int i=0; i<N; i++) {
			if(max < A[i].index - i) {	// 정렬 전 index - 정렬 후 index 계산의 최댓값 저장
				max = A[i].index - i;
			}
		}
		System.out.println(max + 1);
		
		
	}
	
}
class mData implements Comparable<mData> {
	int value;
	int index;
	
	public mData(int value, int index) {
		this.value = value;
		this.index = index;
	}
	
	@Override
	public int compareTo(mData o) {
		return this.value - o.value;
	}
}
