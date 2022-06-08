package doit.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Problem1427 {
	public static void main(String[] args) {
		
		// 선택 정렬 사용하여 내림차순으로 자릿수 정렬하기
		/*
			str (정렬할 수)
			A(자릿수로 구분해 저장한 배열)
			for(str.length)
				A 배열 저장 -> substring
			
			for(i: 0~str) {
				for(j : i+1 ~ str)
					max값 찾기
				}
				i값과 max값중 max가 더 크면 swap 실행
			}
			A 배열 출력
		 */
		/*
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] A = new int[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			A[i] = Integer.parseInt(str.substring(i, i+1));
		}
		
		
		for(int i=0; i<str.length(); i++) {
			int max = i;
			
			for(int j=i+1; j<str.length(); j++) {
				if(A[j] > A[max]) {
					max = j;
				}
			}
			if(A[i] < A[max]) {
				int temp = A[i];
				A[i] = A[max];
				A[max] = temp;
			}
		}
		for(int i=0; i<str.length(); i++) {
			System.out.print(A[i]);
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] A = new int[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			A[i] = Integer.parseInt(str.substring(i, i+1));
		}
		
		Integer[] tmp = Arrays.stream(A).boxed().toArray(Integer[]::new);
		Arrays.sort(tmp, Comparator.reverseOrder()); // 내림차순
		for(int i : tmp) {
			System.out.print(i);
		}
	}

}
