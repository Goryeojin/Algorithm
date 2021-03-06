package backjon.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem11720 {
	public static void main(String[] args) throws IOException {
		// 숫자의 합
		// 1번째 줄에 숫자의 개수 N(1 <= N <= 100), 2번째 줄에 숫자 N개가 공백 없이 주어진다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String listNum = br.readLine();
		int sum = 0;
		
		for(int i=0; i<N; i++) {
//			sum += Integer.parseInt(String.valueOf(listNum.charAt(i)));
			sum += (listNum.charAt(i)) - '0';
		}
		
		System.out.println(sum);
	}

}
