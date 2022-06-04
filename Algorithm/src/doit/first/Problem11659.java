package doit.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem11659 {
	public static void main(String[] args) throws IOException {
		
		// N���� ���� �Է¹����� ���ÿ� �� �迭 ����
		// S[i] = S[i-1] + A[i]
		// ���� i~j�� �������� ���� �� �������� ���� ���
		// S[j] - S[i-1]
		
		// suNo(���� ����), quizNo(���� ����) �����ϱ�
		// for(���� ������ŭ �ݺ��ϱ�) {
		//	�� �迭 �����ϱ�(S[i] = S[i-1] + A[i]
		// }
		// for(���� ������ŭ �ݺ��ϱ�) {
		//	���� ���� �ޱ�(i~j)
		//	���� �� ����ϱ�(S[j] - S[i-1])
		// }
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int sNum = Integer.parseInt(st.nextToken());
		int quizNum = Integer.parseInt(st.nextToken());
		
		long[] S = new long[sNum + 1];
		st = new StringTokenizer(br.readLine());
		
		for(int i=1; i<=sNum; i++) {
			S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
		}
		
		for(int q=0; q<quizNum; q++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			System.out.println(S[j] - S[i-1]);
		}
	}

}
