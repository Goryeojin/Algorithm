package backjon.step03;

import java.util.Scanner;

public class Problem1110 {
	public static void main(String[] args) {
//		�־��� ���� 10���� �۴ٸ� �տ� 0�� �ٿ� �� �ڸ� ���� �����, �� �ڸ��� ���ڸ� ���Ѵ�. 
//		�� ����, �־��� ���� ���� ������ �ڸ� ���� �տ��� ���� ���� ���� ������ �ڸ� ���� �̾� ���̸� ���ο� ���� ���� �� �ִ�. 
//		���� ���� ����.
//
//		26���� �����Ѵ�. 2+6 = 8�̴�. ���ο� ���� 68�̴�. 
//		6+8 = 14�̴�. ���ο� ���� 84�̴�. 8+4 = 12�̴�. ���ο� ���� 42�̴�. 
//		4+2 = 6�̴�. ���ο� ���� 26�̴�.
//
//		���� ���� 4������ ���� ���� ���ƿ� �� �ִ�. ���� 26�� ����Ŭ�� ���̴� 4�̴�.
//
//		N�� �־����� ��, N�� ����Ŭ�� ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		// ���� ������� Ǭ ���
		/*
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		String newNum;
		if(num<10) {
			newNum = "0"+num;
		} else {
			newNum = String.valueOf(num);
		}
		int cycle = 0;
		
		while(true) {
			int a = Integer.parseInt(String.valueOf(newNum.charAt(0)));
			int b = Integer.parseInt(String.valueOf(newNum.charAt(1)));
			String c = String.valueOf(a+b);
			newNum = b +""+ c.charAt(c.length()-1);;
			
			cycle++;
//			System.out.println(a +" " + b + " " + newNum + " " + cycle);
			
			if(num == Integer.parseInt(newNum)) {
				System.out.println(cycle);
				break;
			}
		}
		*/
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
		
		int count = 0;
		int copy = N;
		
		while(true) {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			count++;
			
			if(copy == N) break;
		}
		System.out.println(count);
		
		
	}

}
