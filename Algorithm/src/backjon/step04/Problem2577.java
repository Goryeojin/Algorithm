package backjon.step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2577 {
	public static void main(String[] args) throws IOException {
		/*
		�� ���� �ڿ��� A, B, C�� �־��� �� A �� B �� C�� ����� ����� 
		0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

		���� ��� A = 150, B = 266, C = 427 �̶�� 
		A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�, 
		����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int value = (Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine()));
		String str = Integer.toString(value);
		
		/* ��� 1. ���� for������ �ذ�
		for(int i=0; i<10; i++) {
			int count = 0;
			for(int j=0; j<str.length(); j++) {
				if((str.charAt(j) - '0') == i) {
					count++;
				}
			}
			System.out.println(count);
		}
		*/
		
		// ��� 2. �迭 Ȱ��
		int[] arr = new int[10];
		
		for(int i=0; i<str.length(); i++) {
			arr[(str.charAt(i) - 48)]++;
		}
		for(int v : arr) {
			System.out.println(v);
		}
		
		
	}

}
