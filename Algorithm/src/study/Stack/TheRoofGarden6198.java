package study.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class TheRoofGarden6198 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		long res = 0;
		
		for(int i=0; i<N; i++) {
			int su = Integer.parseInt(br.readLine());
			
			while(!stack.isEmpty() && stack.peek() <= su) {
				stack.pop();
			}
			stack.push(su);
			res += stack.size() - 1;
		}
		System.out.println(res);
	}

}
