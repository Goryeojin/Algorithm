package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountNum2577 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		String str = Integer.toString(val);
		
		int[] arr = new int[10];
		for(int i=0; i<str.length(); i++) {
			arr[str.charAt(i) - '0']++;
		}
		for(int v : arr) {
			System.out.println(v);
		}
		
	}

}
