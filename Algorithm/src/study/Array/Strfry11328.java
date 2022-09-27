package study.Array;

import java.util.Scanner;

public class Strfry11328 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int i=0; i<n; i++) {
			int[] arr = new int[26];
			char[] str1 = sc.next().toCharArray();
			char[] str2 = sc.next().toCharArray();
			for(char c : str1) arr[c - 'a']++;
			for(char c : str2) arr[c - 'a']--;
			boolean flag = true;
			for(int j : arr) {
				if(j != 0) flag = false;
			}
			System.out.println(flag ? "Possible" : "Impossible");
		}
	}

}
