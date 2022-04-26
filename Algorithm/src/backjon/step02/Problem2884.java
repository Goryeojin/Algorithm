package backjon.step02;

import java.util.Scanner;

public class Problem2884 {
	
	// 알람 시간 45분 더 일찍 설정하기
	// 24시간 표현을 사용하며 첫째 줄에 H와 M을 입력받아 45분 전의 시각을 구한다.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		sc.close();

		if(M < 45) {
			H--;
			M = 60 - (45 - M);
			if(H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
			
		} else {
			System.out.println(H + " " + (M - 45));
		}
	}

}
