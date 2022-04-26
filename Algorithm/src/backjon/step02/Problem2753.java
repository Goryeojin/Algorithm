package backjon.step02;

import java.util.Scanner;

public class Problem2753 {
	
	public static void main(String[] args) {
		
		// 윤년인지 아닌지 판단하기
		// 윤년은 4의 배수이면서 100의 배수가 아니거나, 400의 배수이다.
		
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if((year%4 == 0 && year%100 != 0) || (year%400 == 0)) {
			System.out.println("1");
		} else {
			System.out.println(0);
		}
	}

}
