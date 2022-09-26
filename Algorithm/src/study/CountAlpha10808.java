package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CountAlpha10808 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		
		/*
		 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각 알파벳이 단어에 몇 개가 포함되어 있는지 구하는 프로그램을 작성하시오.
		 * 
		 * 1 1 0 0 1 0 0 0 0 1 1 0 0 1 2 0 0 0 0 0 0 0 0 0 0 0
		 */
		
		int[] arr = new int[26];
		for(int i=0; i<str.length();i ++) {
			arr[str.charAt(i) - 'a']++;
		}
		for(int i=0; i<arr.length; i++) {
			bw.append(arr[i] + " ");
		}
		bw.flush();
		bw.close();
	}
}
