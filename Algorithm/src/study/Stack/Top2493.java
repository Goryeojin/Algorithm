package study.Stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Top2493 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Stack<int[]> stack = new Stack<>();
		
		for(int i=1; i<=N; i++) {
			int top = Integer.parseInt(st.nextToken());
			while(!stack.isEmpty()) {
				if(stack.peek()[1] >= top) {
					bw.write(stack.peek()[0] + " ");
					break;
				}
				stack.pop();
			}
			if(stack.isEmpty())
				bw.write("0 ");
			stack.push(new int[] {i, top});
		}
		
		bw.write("\n");
		bw.flush();
		bw.close();
	}
}
