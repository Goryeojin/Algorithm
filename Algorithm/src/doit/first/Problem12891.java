package doit.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem12891 {
	// 데이터 저장
	// S(문자열 저장) P(문자열 크기
	// A = 문자열 데이터
	// checkArr = 비밀번호 체크 배열
	
	// 변수 선언
	// myArr = 현재 상태 배열
	// checkSecret 몇 개의 문자와 관련된 개수를 충족했는지 판단하는 개수
	// P 범위 만큼 S 배열에 적용하고, 유효한 비밀번호인지 판단
	
	// for(i를 P에서 S까지 반복)
	
	static int checkArr[];
	static int myArr[];
	static int checkSecret;
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		int result = 0;
		
		char A[] = new char[S];
		checkArr = new int[4];
		myArr = new int[4];
		
		checkSecret = 0;
		
		A = br.readLine().toCharArray();
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<4; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
			
			if(checkArr[i] == 0) {
				checkSecret++;
			}
		}
		
		// 초기 P부분 문자열 처리 부분
		for(int i=0; i<P; i++) {
			add(A[i]);
		}
		
		if(checkSecret == 4) {
			result++;
		}
		
		for(int i=P; i<S; i++) {
			int j = i - P;
			add(A[i]);
			remove(A[j]);
			if(checkSecret == 4) result++;
		}
		
		System.out.println(result);
		br.close();
	}
	
	// 새로 들어온 문자를 처리하는 함수
	private static void add(char c) {
		
		switch(c) {
		
		case 'A' :
			myArr[0]++;
			if(myArr[0] == checkArr[0])
				checkSecret++;
			break;
		
		case 'C' :
			myArr[1]++;
			if(myArr[1] == checkArr[1])
				checkSecret++;
			break;
			
		case 'G' :
			myArr[2]++;
			if(myArr[2] == checkArr[2])
				checkSecret++;
			break;
			
		case 'T' :
			myArr[3]++;
			if(myArr[3] == checkArr[3])
				checkSecret++;
			break;
		}
	}
	
	// 제거되는 문자를 처리하는 함수
	private static void remove(char c) {
		switch(c) {
		
		case 'A' :
			if(myArr[0] == checkArr[0])
				checkSecret--;
			myArr[0]--;
			break;
		
		case 'C' :
			if(myArr[1] == checkArr[1])
				checkSecret--;
			myArr[1]--;
			break;
			
		case 'G' :
			if(myArr[2] == checkArr[2])
				checkSecret--;
			myArr[2]--;
			break;
			
		case 'T' :
			if(myArr[3] == checkArr[3])
				checkSecret--;
			myArr[3]--;
			break;
		}
		
	}

}
