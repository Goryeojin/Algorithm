package study.Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Roof2217 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		long max = 0;
		for(int i=N-1; i>=0; i--) {
			arr[i] = arr[i] * (N - i);
			if(max < arr[i]) max = arr[i];
		}
		System.out.println(max);
	}

}
