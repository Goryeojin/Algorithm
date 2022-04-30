package backjon.step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Problem3052 {
	public static void main(String[] args) throws IOException {
		/*
		�� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. 
		���� ���, 7, 14, 27, 38�� 3���� ���� �������� 1, 2, 0, 2�̴�. 

		�� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�. 
		�� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		*/
		
		// ��� 1. HashSet�� �̿��ϴ� ���
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0; i<10; i++) {
			set.add(Integer.parseInt(br.readLine()) % 42);
		}
		
		System.out.println(set.size());
		*/
		
		// ��� 2. �迭�� �̿��ϴ� ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] arr = new boolean[42];
		
		for(int i=0; i<10; i++) {
			arr[Integer.parseInt(br.readLine()) % 42] = true;
		}
		
		int count = 0;
		for(boolean value : arr) {
			if(value) {
				count++;
			}
		}
		System.out.println(count);
	}

}
