package backjon.step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2562 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[9];
		int index = 0;
		int max = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			
			if(arr[i] > max) {
				index = i+1;
				max = arr[i];
			}
		}
		
		System.out.println(max);
		System.out.println(index);
	}

}
