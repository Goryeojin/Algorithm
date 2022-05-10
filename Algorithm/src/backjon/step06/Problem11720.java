package backjon.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem11720 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String listNum = br.readLine();
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			sum += Integer.parseInt(String.valueOf(listNum.charAt(i)));
		}
		
		System.out.println(sum);
	}

}
