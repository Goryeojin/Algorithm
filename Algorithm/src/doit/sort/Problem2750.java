package doit.sort;

import java.util.Scanner;

public class Problem2750 {
	public static void main(String[] args) {
		
		// ���� ���ķ� �� �����ϱ�
		/*
			N ������ �� ����
			A ������ �迭 ����
			for(int i=0; i<N-1;) {
				for(int j=0; j<N-1-i;) {
					���� A �迭�� ������ 1ĭ ������ �迭�� ���� �� ������ �� �� �ٲٱ�
				}
			}
			A �迭 ���
		 */
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		for(int i=0; i<N-1; i++) {
			for(int j=0; j<N-1-i; j++) {
				if(A[j] > A[j+1]) {
					int temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
				}
			}
		}
		for(int i=0; i<N; i++) {
			System.out.println(A[i]);
		}
	}

}
