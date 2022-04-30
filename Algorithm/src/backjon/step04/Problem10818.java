package backjon.step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem10818 {
	public static void main(String[] args) throws IOException {
		/*
		첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 
		둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
		첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
		*/
		
		// 방법 1. Scanner와 int[] 이용
		/*
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(arr);
		
		System.out.println(arr[0] + " " + arr[N-1]);
		*/
		
		// 2. BufferedReader 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int index = 0;
		int[] arr = new int[N];
		while(st.hasMoreTokens()) {
			arr[index] = Integer.parseInt(st.nextToken());
			index++;
		}
		
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[N-1]);
	}
}
