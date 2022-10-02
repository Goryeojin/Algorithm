package study.UseOfStack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ValueOfParenthesis2504 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] cArr = br.readLine().toCharArray();
		Stack<Character> stack = new Stack<>();
		
		int ans = 0;
		int calc = 1;
		boolean flag = false;
		
		for(int i=0; i<cArr.length; i++) {
			if(cArr[i] == '(') {
				stack.push(cArr[i]);
				calc *= 2;
			} else if(cArr[i] == '[') {
				stack.push(cArr[i]);
				calc *= 3;
			}
			
			if(cArr[i] == ')') {
				if(stack.empty() || stack.peek() != '(') {
					flag = true;
					break;
				} else if(cArr[i - 1] == '(') {
					ans += calc;
				}
				stack.pop();
				calc /= 2;
			} else if(cArr[i] == ']') {
				if(stack.empty() || stack.peek() != '[') {
					flag = true;
					break;
				} else if(cArr[i - 1] == '['){
					ans += calc;
				}
				stack.pop();
				calc /= 3;
			}
		}
		if(flag || !stack.empty()) {
			System.out.println(0);
		} else {
			System.out.println(ans);
		}
	}
}
