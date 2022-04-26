package backjon.step02;

import java.util.Scanner;

public class Problem14681 {
	
	public static void main(String[] args) {
		
		// x좌표와 y좌표를 입력받아 주어진 점이 어느 사분면에 속하는지 알아내기
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		sc.close();
		
		if(x > 0) {
			if(y > 0) {
				System.out.println(1);
			} else {
				System.out.println(4);
			}
		} else {
			if(y > 0) {
				System.out.println(2);
			} else {
				System.out.println(3);
			}
		}
	}

}
