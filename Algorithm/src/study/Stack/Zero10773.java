package study.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zero10773 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		
		int sum = 0;
		
		for(int i=0; i<k; i++) {
			
			int t = Integer.parseInt(br.readLine());
			
			if(t == 0) {
				sum -= stack.pop();
			} else {
				sum += stack.push(t);
			}
		}
		
		System.out.println(sum);
	}

}
