package backjon.step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem8958 {
	public static void main(String[] args) throws IOException {
		/*
		"OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. ������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. ���� ���, 10�� ������ ������ 3�� �ȴ�.

		"OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
		ù° �ٿ� �׽�Ʈ ���̽��� ������ �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ���̰� 0���� ũ�� 80���� ���� ���ڿ��� �־�����. ���ڿ��� O�� X������ �̷���� �ִ�
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String arr[] = new String[Integer.parseInt(br.readLine())];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = br.readLine();
		}
		
		for(int i=0; i<arr.length; i++) {
			int count = 0;
			int sum = 0;
			
			for(int j=0; j<arr[i].length(); j++) {
				
				if(arr[i].charAt(j) == 'O') {
					count++;
				} else {
					count = 0;
				}
				sum += count;
			}
			System.out.println(sum);
		}
		
	}

}
