package backjon.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1152 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		/*
		int cnt = 0;
		
		while(st.hasMoreTokens()) {
			cnt ++;
			
		}
		System.out.println(cnt);
		*/
		
		System.out.println(st.countTokens());
	}

}
