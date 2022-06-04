package doit.first;

import java.io.IOException;
import java.util.Scanner;

public class Problem10986 {
	public static void main(String[] args) throws IOException {
		// ������ �� ���ϱ�
		// ������ ���� N
		// ������ ������ �� M
		// �� �迭 S
		// ���� �������� �ε��� ī��Ʈ�ϴ� �迭 C
		
		// for(i -> 1~N) {
		//	S[i] = S[i-1] + A[i] �� �迭 ����
		//	}
		
		// for(i -> 0~N) {
		//	remainder = S[i] % M �� �迭�� M���� ���� ��
		// 	if(remainder == 0) ���� 1 ����
		// 	C[remainder]�� �� 1 ����
		// }
		
		// for(i -> 0~M) {
		// 	 C[i] (i�� �������� �ε����� ����)���� 2������ �̴� ����� ���� ���信 ���ϱ�
		//		(C[i]�� �� 2���� �̴� ����� �� ��� ���� C[i] * (C[i] - 1) / 2
		// }
		// ����� ���
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[] S = new long[N];
		long[] C = new long[M];
		long answer = 0;
		
		S[0] = sc.nextInt();
		for(int i=1; i<N; i++) {
			S[i] = S[i-1] + sc.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			int remainder = (int)(S[i] % M);
			
			if(remainder == 0) answer++;
			
			C[remainder]++;
		}
		
		for(int i=0; i<M; i++) {
			if(C[i] > 1) {
				answer = answer + (C[i] * (C[i] - 1) / 2);
			}
		}
		System.out.println(answer);
	}

}
