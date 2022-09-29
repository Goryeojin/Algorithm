package study.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackSequence1874 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Stack<Integer> stack = new Stack<>();
		int num = 1;
		boolean result = true;
		for(int i=0; i<arr.length; i++) {
			int su = arr[i];
			
			if(su >= num) {
				while(su >= num) {
					stack.push(num++);
					sb.append("+\n");
				}
				stack.pop();
				sb.append("-\n");
			}
			else {
				int n = stack.pop();
				
				if(n > su) {
					System.out.println("NO");
					result = false;
					break;
				} else {
					sb.append("-\n");
				}
			}
		}
		if(result) System.out.println(sb);
	}
	

}
