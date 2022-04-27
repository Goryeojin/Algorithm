package backjon.step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem2525 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		// 두 번째 줄에 출력해야 하는 변수는 StringTokenizer가 아닌 기본 입력 사용
		int C = Integer.parseInt(br.readLine());
		
		// 1시간은 60분이기 때문에 C분에 60을 나눠서 나온 몫과 나머지를 각 시, 분에 합산
		A += C / 60;
		B += C % 60;
		
		// B분이 60분 이상이면 A시에 1시간 추가 후 B분에서 60분 빼기
		if(B>=60) {
			A += 1;
			B -= 60;
		}
		// A시가 24시간 이상이면 A에서 24시간 빼기
		if(A > 23) {
			A -= 24;
		}
		// 가운데 공백을 두고 결과 출력
		System.out.println(A + " " + B);
		
	}

}
