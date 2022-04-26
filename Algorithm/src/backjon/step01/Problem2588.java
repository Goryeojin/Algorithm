package backjon.step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2588 {
	
	public static void main(String[] args) throws IOException {
		/* 내가 처음 푼 방식
		Scanner sc = new Scanner(System.in);
		
		int A = Integer.parseInt(sc.nextLine());
		String B = sc.nextLine();
		
		sc.close();
		
		int B1 = Integer.parseInt(String.valueOf(B.charAt(0)));
		int B2 = Integer.parseInt(String.valueOf(B.charAt(1)));
		int B3 = Integer.parseInt(String.valueOf(B.charAt(2)));
		
		System.out.println(A * B3);
		System.out.println(A * B2);
		System.out.println(A * B1);
		System.out.println(A * Integer.parseInt(B));
		
		*/
		
		// 1. charAt() 사용
		/*
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		String B = sc.next();
		
		sc.close();
		
		System.out.println(A * (B.charAt(2) - '0'));
		System.out.println(A * (B.charAt(1) - '0'));
		System.out.println(A * (B.charAt(0) - '0'));
		System.out.println(A * Integer.parseInt(B));
		*/
		
		// 2. 숫자를 수학적으로 접근
		/*
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		sc.close();
		
		System.out.println(A*(B%10));
		System.out.println(A*(B%100/10));
		System.out.println(A*(B/100));
		System.out.println(A*B);
		*/
		
		// 3. toCharArray() 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		String B = br.readLine();
		
		char[] b = B.toCharArray();
		
		System.out.println(A * (b[2]-'0'));
		System.out.println(A * (b[1]-'0'));
		System.out.println(A * (b[0]-'0'));
		System.out.println(A * Integer.parseInt(B));
	}

}