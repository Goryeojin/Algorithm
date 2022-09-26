package study;

import java.util.Scanner;

public class RoomNum1475 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] arr = new int[10];
		int count = 0;
		int max = 0;
		
		for(int i=0; i<str.length(); i++) {
			arr[str.charAt(i) - '0']++;
		}
		
		int k = arr[6] + arr[9];
		if(k % 2 == 0) {
			arr[6] = k / 2;
			arr[9] = k / 2;
		} else {
			arr[6] = k / 2 + 1;
			arr[9] = k / 2 + 1;
		}
		
		for(int i : arr) {
			max = Math.max(i, max);
		}
		System.out.println(max);
	}

}
