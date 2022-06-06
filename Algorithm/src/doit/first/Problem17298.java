package doit.first;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Problem17298 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// �����̿��� ��ū�� ����
		
		/*
			N(���� ����) A[](���� �迭) ans[](���� �迭)
			���� �迭 ä���
			���� ���� �ʱ�ȭ�ϱ�
			for(N) {
				while(���ú�������ʰ�, ����������� top�������� Ŭ������){
					pop()
					���� �迭�� ��ū���� ���� ������ �����ϱ�
				}
				���� ������ ���ÿ� push()
			}
			while(������ �􋚱���) {
				���ÿ� �ִ� �ε����� ���� �迭�� -1 ����
			}
			���� �迭 ���
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];	// ���� �迭 ����
		int[] ans = new int[N];	// ���� �迭 ����
		
		String[] str = br.readLine().split(" ");
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(str[i]);
		}
		
		Stack<Integer> stack = new Stack<>();
		stack.push(0);	// ó������ ������ �׻� ��������Ƿ� ���� ���� push�� �ʱ�ȭ
		
		for(int i=1; i<N; i++) {
			// ������ ��� ���� �ʰ� ���� ������ top �ε����� ����Ű�� �������� Ŭ ���
			while(!stack.isEmpty() && A[stack.peek()] < A[i]) {
				ans[stack.pop()] = A[i];
			}
			stack.push(i);
		}
		
		while(!stack.empty()) {
			// �ݺ����� ���� ���Դµ� ������ ��� ���� �ʾҴٸ�
			ans[stack.pop()] = -1;
			// ���ÿ� ���� index�� -1�� �ְ�
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0; i<N; i++) {
			bw.write(ans[i] + " ");
		}
		bw.write("\n");
		bw.flush();
	}

}
