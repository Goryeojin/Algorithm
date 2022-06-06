package doit.first;

import java.util.Scanner;
import java.util.Stack;

public class Problem1874 {
	/* ���ð� ť �̿��� ���ü��� */
	/*
		N(���� ����) A[](���� �迭)
		���� �迭 ä���
		for(N��ŭ)
		{
			if(��������� >= �������� �ڿ���){
				while(�� ����������){
					push()
					+ ����
				}
				pop()
				-����
			} else(���� ������ < �������� �ڿ���){
				pop()
				- ����
				if(pop�� > ������ ��) NO ���
				else - ����
			}
		}
		if(NO�� ��� ��������) ���尪 ���
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		Stack<Integer> stack = new Stack<>();
		StringBuffer bf = new StringBuffer();
		
		int num = 1; // �������� ��
		boolean result = true;
		
		for(int i=0; i<A.length; i++) {
			
			int su = A[i];	// ���� ������ ��
			if(su >= num) {	// ���� ������ >= �������� �ڿ��� : ���� ������ ������ push() ����
				
				while(su >= num) {
					stack.push(num++);
					bf.append("+\n");
				}
				stack.pop();
				bf.append("-\n");
				
			} else {		// ���� ������ < �������� �ڿ��� : pop()�� ������ ���� ���Ҹ� ����
				int n = stack.pop();
				// ������ ���� ���� ���� ������ �ϴ� ������ ������ ũ�� ������ ����� �� ����
				if(n>su) {
					
					System.out.println("NO");
					result = false;
					break;
				} else {
					bf.append("-\n");
				}
			}
		}
		if(result) System.out.println(bf.toString());
		
	}

}
