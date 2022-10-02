package study.Deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class AC5430 {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		/*
		 * 문자열 분리 방법
		 * 
		 * 1. StringTokenizer
		 * StringTokenizer st = new StringTokenizer(string, "[],");
		 * 
		 * 2. split()
		 * String[] s1 = string.split("[\\[\\]\\,]");
		 * String[] s2 = string.split("[^0-9]");
		 * => 맨 앞 인덱스 빈 문자열
		 * 
		 * 3. split()
		 * String s = "[1,2,3,4]";
		 * String subS = s.subString(1, s.length - 1); // subS = "1,2,3,4"
		 * String[] s1 = subS.split(",");
		 */
		ArrayDeque<Integer> deque;
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			String cmd = br.readLine();
			int n = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine(), "[],");
			
			deque = new ArrayDeque<>();
			
			for(int i=0; i<n; i++) {
				deque.add(Integer.parseInt(st.nextToken()));
			}
			
			AC(cmd, deque);
		}
		System.out.println(sb);
	}
	
	public static void AC(String cmd, ArrayDeque<Integer> deque) {
		
		boolean isRight = true;
		
		for(char c : cmd.toCharArray()) {
			if(c == 'R') {
				isRight = !isRight;
				continue;
			}
			
			// D
			if(isRight) {
				if(deque.pollFirst() == null) {
					sb.append("error\n");
					return;
				}
			} else {
				if(deque.pollLast() == null) {
					sb.append("error\n");
					return;
				}
			}
		}
		
		makePrintString(deque, isRight);
	}
	
	public static void makePrintString(ArrayDeque<Integer> deque, boolean isRight) {
		sb.append('[');
		
		if(deque.size() > 0) {
			if(isRight) {
				sb.append(deque.pollFirst());
				
				while(!deque.isEmpty()) {
					sb.append(',').append(deque.pollFirst());
				}
			} else {
				sb.append(deque.pollLast());
				
				while(!deque.isEmpty()) {
					sb.append(',').append(deque.pollLast());
				}
			}
		}
		
		sb.append(']').append('\n');
	}
}
