package study.Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QueueTwo18258 {
	public static int[] queue;
	public static int head, tail;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		queue = new int[N];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			
			switch(str) {
			
			case "push":
				push(Integer.parseInt(st.nextToken()));
				break;
				
			case "pop":
				sb.append(pop()).append("\n");
				break;
				
			case "size":
				sb.append(size()).append("\n");
				break;
				
			case "empty":
				sb.append(empty()).append("\n");
				break;
				
			case "front":
				sb.append(front()).append("\n");
				break;
				
			case "back":
				sb.append(back()).append("\n");
				break;
			}
		}
		System.out.println(sb);
	}
	
	public static void push(int item) {
		queue[tail] = item;
		tail++;
	}
	
	public static int pop() {
		if(head == tail)
			return -1;
		else
			return queue[head++];
	}
	
	public static int size() {
		return tail - head;
	}
	
	public static int empty() {
		if(head == tail)
			return 1;
		else
			return 0;
	}
	
	public static int front() {
		if(head == tail)
			return -1;
		else
			return queue[head];
	}
	
	public static int back() {
		if(head == tail)
			return -1;
		else
			return queue[tail - 1];
	}
}
