package backjon.step02;

import java.util.Scanner;

public class Problem9498 {

	public static void main(String[] args) {
		
		// 정수로 점수를 입력받아 구간별 등급 산출
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		sc.close();
		
		if(score >= 90) {
			System.out.println("A");
		} else if(score >= 80) {
			System.out.println("B");
		} else if(score >= 70) {
			System.out.println("C");
		} else if(score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
	}

}
