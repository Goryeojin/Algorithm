package backjon.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem2908 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		/* 내가 푼 방법
		String arr1[] = new String[3];
		String arr2[] = new String[3];
		
		String str1 = st.nextToken();
		String str2 = st.nextToken();
		
		int cnt = 2;
		
		for(int i=0; i<3; i++) {
			arr1[i] = String.valueOf(str1.charAt(cnt));
			arr2[i] = String.valueOf(str2.charAt(cnt));
			
			cnt--;
		}
		
		str1 = arr1[0] + arr1[1] + arr1[2];
		str2 = arr2[0] + arr2[1] + arr2[2];
		
		int val1 = Integer.parseInt(str1);
		int val2 = Integer.parseInt(str2);
		
		System.out.println(val1 > val2 ? val1 : val2);
		*/
		
		/* StringBuilder 클래스의 reverse() 메소드 사용
		int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		
		System.out.println(A > B ? A : B);
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		sc.close();
		
		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
		
		System.out.println(A > B ? A : B);
	}

}
