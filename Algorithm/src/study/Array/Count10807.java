package study.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Count10807 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[201];
		
		for(int i=0; i<n; i++) {
			arr[Integer.parseInt(st.nextToken()) + 100]++;
		}
		System.out.println(arr[Integer.parseInt(br.readLine()) + 100]);
	}
}
