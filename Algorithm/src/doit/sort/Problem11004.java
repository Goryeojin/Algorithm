package doit.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem11004 {
	/*
	 * �� �������� �������� K��° �� ���ϱ�
	 
	 N(������ ����) K(K��° ��)
	 A(���� ������ ���� �迭)
	 for(N) {
	 	A�迭 ����
	 }
	 �� ��Ʈ �����ϱ�
	 K��° ������ ����ϱ�
	 
	 [���� �Լ� ����]
	 �� ��Ʈ �Լ�(����, ����, K) {
	 	�ǹ� ���ϱ� �Լ�(����, ����)
	 	if(�ǹ� == k) ����
	 	else if(K < �ǹ�) �� ��Ʈ �����ϱ� (����, �ǹ� - 1, K)
	 	else �� ��Ʈ �����ϱ�(�ǹ� + 1, ����, K)
	 }
	 
	 �ǹ� ���ϱ� �Լ�(����, ����) {
	 	�߾Ӱ��� �ǹ����� �����ϱ�
	 	i(������), j(������)
	 	while(i<j) {
	 		�ǹ����� ū ���� ���� ������ i++
	 		�ǹ����� ���� ���� ���� ������ j--
	 		ã�� i�� j ������ swap
	 	}
	 	�ǹ� �����͸� ������ �� �׷��� ��� index�� �����ϱ�
	 }
	 */

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		quickSort(A, 0, N-1, K-1);
		System.out.println(A[K-1]);
		
		
//		Arrays.sort(A);
//		System.out.println(A[K-1]);
	}
	
	public static void quickSort(int[] A, int S, int E, int K) {
		if(S < E) {
			int pivot = partition(A, S, E);
			if(pivot == K)				// K��° ���� pivot�̸� �� �̻� ���� �ʿ� ����
				return;
			else if(K < pivot)			// K�� pivot���� ������ ���� �׷츸 ���� �����ϱ�
				quickSort(A, S, pivot - 1, K);
			else						// K�� pivot���� ũ�� ������ �׷츸 ���� �����ϱ�
				quickSort(A, pivot + 1, E, K);
		}
	}
	
	public static int partition(int[] A, int S, int E) {
		int M = (S + E) / 2;
		swap(A, S, M);	// �߾Ӱ��� 1��° ��ҷ� �̵��ϱ�
		int pivot = A[S];
		int i = S, j = E;
		while(i < j) {
			while(pivot < A[j]) {	// �ǹ����� ���� ���� ���� ������ j--
				j--;
			}
			while(i < j && pivot >= A[i]) {	// �ǹ����� ū ���� ���� ������ i++
				i++;
			}
			swap(A, i, j);		// ã�� i�� j�� ��ȯ�ϱ�
		}
		// i == j �ǹ��� ���� �������� �и��� ����� ������ �����ϱ�
		A[S] = A[i];
		A[i] = pivot;
		return i;
	}
	
	public static void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
}
