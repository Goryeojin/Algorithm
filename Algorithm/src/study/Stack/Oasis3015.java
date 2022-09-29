package study.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Oasis3015 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Stack<Pair> stack = new Stack<>();
		long cnt = 0;
		
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(br.readLine());
			Pair pair = new Pair(num, 1);
			
			while(!stack.isEmpty() && stack.peek().height <= num) {
				Pair pop = stack.pop();
				cnt += pop.cnt;
				if(pop.height == num)
					pair.cnt += pop.cnt;
			}
			if(!stack.isEmpty())
				cnt++;
			stack.push(pair);
		}
		
		System.out.println(cnt);
	}
	
	static class Pair {
		int height;
		int cnt;
		
		Pair(int height, int cnt){
			this.height = height;
			this.cnt = cnt;
		}
	}

}
