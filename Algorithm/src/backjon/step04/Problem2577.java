package backjon.step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2577 {
	public static void main(String[] args) throws IOException {
		/*
		세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 
		0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.

		예를 들어 A = 150, B = 266, C = 427 이라면 
		A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
		계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int value = (Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine()));
		String str = Integer.toString(value);
		
		/* 방법 1. 이중 for문으로 해결
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
		
		// 방법 2. 배열 활용
		int[] arr = new int[10];
		
		for(int i=0; i<str.length(); i++) {
			arr[(str.charAt(i) - 48)]++;
		}
		for(int v : arr) {
			System.out.println(v);
		}
		
		
	}

}
