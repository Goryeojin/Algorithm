package doit.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem1377 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// ���� ����
		/*
			N(������ ����)
			A(������ �迭(Ŭ����������))
			for(N)
			{
				�迭 ����
			}
			A �迭 ����
			for(N)
			{
				A[i] ���� �� index - ���� �� index ����� �ִ� ã�� ����
			}
			�ִ� + 1 ���� ���
			
			���� Ŭ���� ����
			mData(������ǥ��)
			{
				index, value�� ������
				value ���� �������� ���� �Լ� Comparable ����
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
			if(max < A[i].index - i) {	// ���� �� index - ���� �� index ����� �ִ� ����
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
