package doit.first;

import java.util.Scanner;

public class Problem2018 {
	public static void main(String[] args) {
		
		// N 변수 저장
		// 사용 변수 저장 (count, start_index, end_index, sum = 1)
		// while ( end_index != N) sum == N / sum > N / sum < N
		// 카운트 출력
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int count = 1;
		int start_index = 1;
		int end_index = 1;
		int sum = 1;
		
		while(end_index != N) {
			if(sum == N) {
				count++;
				end_index++;
				sum += end_index;
			} else if(sum > N) {
				sum -= start_index;
				start_index++;
			} else {
				end_index++;
				sum += end_index;
			}
		}
		System.out.println(count);
	}

}
