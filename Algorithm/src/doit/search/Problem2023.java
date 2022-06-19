package doit.search;

import java.util.Scanner;

public class Problem2023 {
	/*
	 * DFS로 소수인 숫자 찾기
	
	N(자릿수)
	DFS 실행하기(숫자 2, 3, 5, 7로 탐색 시작)
	// DFS 구현하기
	DFS {
		if(자릿수 == N) {
			if(소수) 수 출력하기
			탐색 종료
		}
	
		for(1~9) 반복 {
			if(뒤에 붙는 숫자가 홀수이면서 소수일 때)
			DFS 실행 : 자릿수 + 1, 수 * 10 + 뒤에 붙는 수
		}
	}
	
	// 소수 구하기 함수
	for('2 ~ 현재 수 / 2' 반복하기) {
		if(나머지가 0이면) return 소수가 아님
	}
	return 소수임
	 */
	
	public static int N;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		DFS(2, 1);
		DFS(3, 1);
		DFS(5, 1);
		DFS(7, 1);
	}
	
	static void DFS(int number, int jarisu) {
		if(jarisu == N) {
			if(isPrime(number)) {
				System.out.println(number);
			}
			return;
		}
		for(int i=1; i<10; i++) {
			if(i % 2 == 0) {
				continue;
			}
			if(isPrime(number * 10 + i)) {
				DFS(number * 10 + i, jarisu + 1);
			}
		}
	}
	
	static boolean isPrime(int num) {
		for(int i=2; i<=num / 2; i++)
			if(num % i == 0) return false;
		return true;
	}
}
