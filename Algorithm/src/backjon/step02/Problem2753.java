package backjon.step02;

import java.util.Scanner;

public class Problem2753 {
	
	public static void main(String[] args) {
		
		// �������� �ƴ��� �Ǵ��ϱ�
		// ������ 4�� ����̸鼭 100�� ����� �ƴϰų�, 400�� ����̴�.
		
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if((year%4 == 0 && year%100 != 0) || (year%400 == 0)) {
			System.out.println("1");
		} else {
			System.out.println(0);
		}
	}

}
