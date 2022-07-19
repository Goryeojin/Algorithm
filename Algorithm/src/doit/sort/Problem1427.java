package doit.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Problem1427 {
	public static void main(String[] args) {
		
		// ���� ���� ����Ͽ� ������������ �ڸ��� �����ϱ�
		/*
			str (������ ��)
			A(�ڸ����� ������ ������ �迭)
			for(str.length)
				A �迭 ���� -> substring
			
			for(i: 0~str) {
				for(j : i+1 ~ str)
					max�� ã��
				}
				i���� max���� max�� �� ũ�� swap ����
			}
			A �迭 ���
		 */
		/*
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] A = new int[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			A[i] = Integer.parseInt(str.substring(i, i+1));
		}
		
		
		for(int i=0; i<str.length(); i++) {
			int max = i;
			
			for(int j=i+1; j<str.length(); j++) {
				if(A[j] > A[max]) {
					max = j;
				}
			}
			if(A[i] < A[max]) {
				int temp = A[i];
				A[i] = A[max];
				A[max] = temp;
			}
		}
		for(int i=0; i<str.length(); i++) {
			System.out.print(A[i]);
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] A = new int[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			A[i] = Integer.parseInt(str.substring(i, i+1));
		}
		
		Integer[] tmp = Arrays.stream(A).boxed().toArray(Integer[]::new);
		Arrays.sort(tmp, Comparator.reverseOrder()); // ��������
		for(int i : tmp) {
			System.out.print(i);
		}
	}

}