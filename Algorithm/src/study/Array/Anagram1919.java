package study.Array;

import java.util.Scanner;

public class Anagram1919 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26];
		int cnt = 0;
		
		char[] str1 = sc.nextLine().toCharArray();
		char[] str2 = sc.nextLine().toCharArray();
		
		for(char c : str1) arr[c - 'a']++;
		for(char c : str2) arr[c - 'a']--;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Math.abs(arr[i]);
			if(arr[i] != 0)
				cnt += arr[i];
		}
		System.out.println(cnt);
	}

}
