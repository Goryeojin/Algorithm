package study.UseOfStack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MetalRod10799 {
	//3 3 2 3 2 2 1 0 1
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		Stack<Character> stack = new Stack<>();
		int cnt = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '(') {
				stack.push('(');
			} else {
				stack.pop();
				
				if(str.charAt(i - 1) == '(')
					cnt += stack.size();
				else
					cnt++;
			}
		}
		System.out.println(cnt);
	}
}
