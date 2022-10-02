package study.UseOfStack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Parenthesis9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		Stack<Character> stack;
		String str;
		
		for(int i=0; i<N; i++) {
			str = br.readLine();
			stack = new Stack<>();
			for(int j=0; j<str.length(); j++) {
				char c = str.charAt(j);
				
				if(c == '(')
					stack.push(c);
				else {
					if(!stack.empty() && stack.peek() == '(')
						stack.pop();
					else
						stack.push(c);
				}
			}
			if(stack.empty())
				sb.append("YES").append('\n');
			else
				sb.append("NO").append('\n');
		}
		
		System.out.println(sb);
	}
}
