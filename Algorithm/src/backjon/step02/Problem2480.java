package backjon.step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem2480 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		int num3 = Integer.parseInt(st.nextToken());
		
		int result = 0;
		
		int[] numArr = {num1, num2, num3};
		// Arrays 클래스의 sort() 메소드 사용
		// 값이 작은 순으로 배열이 재배치됨.
		Arrays.sort(numArr);
		
		if(num1 == num2 && num1 == num3) { // 세 값이 같을 때
			result = 10000 + num1 * 1000;
		} else if(num1 == num2 || num1 == num3) {
			result = 1000 + num1 * 100;
		} else if(num2 == num3) {
			result = 1000 + num2 * 100;
		} else {
			// 가장 큰 값은 배열의 마지막 인덱스에 담김.
			result = numArr[numArr.length-1] * 100;
			
			// Math 클래스의 max() 메소드 사용
			result = Math.max(num1, Math.max(num2, num3));
		}
		
		System.out.println(result);
		
	}

}
