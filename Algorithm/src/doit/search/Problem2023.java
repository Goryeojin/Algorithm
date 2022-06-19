package doit.search;

import java.util.Scanner;

public class Problem2023 {
	/*
	 * DFS�� �Ҽ��� ���� ã��
	
	N(�ڸ���)
	DFS �����ϱ�(���� 2, 3, 5, 7�� Ž�� ����)
	// DFS �����ϱ�
	DFS {
		if(�ڸ��� == N) {
			if(�Ҽ�) �� ����ϱ�
			Ž�� ����
		}
	
		for(1~9) �ݺ� {
			if(�ڿ� �ٴ� ���ڰ� Ȧ���̸鼭 �Ҽ��� ��)
			DFS ���� : �ڸ��� + 1, �� * 10 + �ڿ� �ٴ� ��
		}
	}
	
	// �Ҽ� ���ϱ� �Լ�
	for('2 ~ ���� �� / 2' �ݺ��ϱ�) {
		if(�������� 0�̸�) return �Ҽ��� �ƴ�
	}
	return �Ҽ���
	 */
	
	public static int N;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		DFS(2, 1);
		DFS(3, 1);
		DFS(5, 1);
		DFS(7, 1);
	}
	
	static void DFS(int number, int jarisu) {
		if(jarisu == N) {
			if(isPrime(number)) {
				System.out.println(number);
			}
			return;
		}
		for(int i=1; i<10; i++) {
			if(i % 2 == 0) {
				continue;
			}
			if(isPrime(number * 10 + i)) {
				DFS(number * 10 + i, jarisu + 1);
			}
		}
	}
	
	static boolean isPrime(int num) {
		for(int i=2; i<=num / 2; i++)
			if(num % i == 0) return false;
		return true;
	}
}
