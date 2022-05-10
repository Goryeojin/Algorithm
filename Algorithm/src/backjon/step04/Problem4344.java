package backjon.step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem4344 {
	/*
	ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.

	��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, 
	�̾ N���� ������ �־�����. ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
	�� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�.
	
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
			
			st = new StringTokenizer(br.readLine(), " "); 	// �л� �� �� ���� �Է�
			
			int N = Integer.parseInt(st.nextToken());		// �л� ��
			arr = new int[N];
			
			int sum = 0;	// ���� ���� �� ����
			
			for(int j=0; j<N; j++) {	// ���� ����
				int val = Integer.parseInt(st.nextToken());
				arr[j] = val;
				sum += val;
			}
			
			double avg = (double)sum / N;
			
			int count = 0;	// ��� �Ѵ� �л� �� ����
			
			for(int j=0; j<N; j++) {
				if(arr[j] > avg) {
					count ++;
				}
			}
			
			System.out.printf("%.3f%%\n", ((double)count/N)*100);
			
		}
	}
}