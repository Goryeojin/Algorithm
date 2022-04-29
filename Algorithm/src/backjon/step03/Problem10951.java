package backjon.step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem10951 {
	public static void main(String[] args) throws IOException {
		/*
		 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 */
		
		// 방법 1. Scanner 클래스의 hasNext() 메소드 이용
//		Scanner sc = new Scanner(System.in);
//		
//		while(sc.hasNextInt()) {
//			
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			System.out.println(a+b);
//		}
//		
//		sc.close();
		
		// 방법 2. BufferedReader + StringTokenizer
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String str;
		
		while((str=br.readLine()) != null) {
			st = new StringTokenizer(str, " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sb.append(a+b).append("\n");
		}
		System.out.println(sb);
	}

}
