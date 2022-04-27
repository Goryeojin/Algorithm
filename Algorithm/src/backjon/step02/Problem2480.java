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
		// Arrays Ŭ������ sort() �޼ҵ� ���
		// ���� ���� ������ �迭�� ���ġ��.
		Arrays.sort(numArr);
		
		if(num1 == num2 && num1 == num3) { // �� ���� ���� ��
			result = 10000 + num1 * 1000;
		} else if(num1 == num2 || num1 == num3) {
			result = 1000 + num1 * 100;
		} else if(num2 == num3) {
			result = 1000 + num2 * 100;
		} else {
			// ���� ū ���� �迭�� ������ �ε����� ���.
			result = numArr[numArr.length-1] * 100;
			
			// Math Ŭ������ max() �޼ҵ� ���
			result = Math.max(num1, Math.max(num2, num3));
		}
		
		System.out.println(result);
		
	}

}
