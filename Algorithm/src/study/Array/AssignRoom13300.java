package study.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AssignRoom13300 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[2][7];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int max = Integer.parseInt(st.nextToken());
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())]++;
		}
		int cnt = 0;
		for(int i=0; i<2; i++) {
			for(int j=1; j<=6; j++) {
				cnt += arr[i][j] / max;
				if(arr[i][j] % max == 1) cnt++;
			}
		}
		System.out.println(cnt);
	}

}
