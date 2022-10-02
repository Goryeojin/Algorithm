package study.UseOfStack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class GoodWord3986 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		Stack<Character> stack;
		String str;
		
		for(int i=0; i<N; i++) {
			str = br.readLine();
			stack = new Stack<>();
			for(int j=0; j<str.length(); j++) {
				char c = str.charAt(j);
				
				if(!stack.empty() && stack.peek() == c) {
					stack.pop();
				} else {
					stack.push(c);
				}
			}
			if(stack.empty()) cnt++;
		}
		System.out.println(cnt);
	}
}
