package doit.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem10989 {
	/*
	 * ��� ���ķ� �������� ����
	N(������ �� ����)
	A(������ �迭 �����ϱ�)
	for(N) {
		A �迭 ����
	}
	��� ���� �Լ� ����
	���ĵ� A �迭 ���
	
	// ��� ���� �Լ� ����
	// ���� ���� ��
	bucket(���� �ڸ������� ������ �� �迭�� ���·� �˷��ִ� �迭)
	ex : bucket[4] -> ���� ���� �ڸ����� 0~4���� �� ���� �����Ͱ� �ִ��� �����ϱ�
	output(�ӽ� ������ ���� �迭)
	jarisu(���� �ڸ����� ǥ���ϴ� ��)
	// ���� �κ�
	while(�ִ� �ڸ�����ŭ �ݺ�)
	{
		���� ���� �ڸ����� �������� A �迭 �����͸� bucket�� count
		�� �迭 �������� bucket�� �� �迭 ���·� �����ϱ�
		for(N)
		{
			bucket���� �̿��� ���� ���� �ڸ����� �����͸� �����ϱ�
			output �迭�� �����ϱ�
		}
		for(N)
		{
			���� �ڸ��� �̵��� ���� A �迭�� output ������ �����ϱ�
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
		while(count != max_size) {		// �ִ� �ڸ�����ŭ �ݺ��ϱ�
			int[] bucket = new int[10];
			for(int i=0; i<A.length; i++) {
				bucket[(A[i] / jarisu) % 10]++;	// ���� �ڸ����� �����ϱ�
			}
			for(int i=1; i<10; i++) {	// �� �迭�� �̿��� index ����ϱ�
				bucket[i] += bucket[i - 1];
			}
			for(int i=A.length-1; i>=0; i--) {	// ���� �ڸ����� �������� �����ϱ�
				output[bucket[(A[i] / jarisu % 10)] - 1] = A[i];
				bucket[(A[i] / jarisu) % 10]--;
			}
			for(int i=0; i<A.length; i++) {
				// ���� �ڸ����� �̵��ϱ� ���� ���� �ڸ��� ���� ���� ������ �����ϱ�
				A[i] = output[i];
			}
			jarisu *= 10;	// �ڸ��� ������Ű��
			count++;
		}
	}
}
