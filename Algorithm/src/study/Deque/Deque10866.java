package study.Deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Deque10866 {
	
	static int[] deq = new int[10000];
	static int front = 0;
	static int back = 0;
	static int size = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++) {
			String[] str = br.readLine().split(" ");
			
			switch(str[0]) {
			
			case "push_front" :
				push_front(Integer.parseInt(str[1]));
				break;
			case "push_back" :
				push_back(Integer.parseInt(str[1]));
				break;
			case "pop_front" :	
				sb.append(pop_front()).append("\n");
				break;
			case "pop_back" :
				sb.append(pop_back()).append("\n");
				break;
			case "size" :
				sb.append(size()).append("\n");
				break;
			case "empty" :
				sb.append(empty()).append("\n");
				break;
			case "front" :
				sb.append(front()).append("\n");
				break;
			case "back" :
				sb.append(back()).append("\n");
				break;
			}
		}
		System.out.println(sb);
	}
	
	public static void push_front(int val) {
		deq[front] = val;
		front = (front - 1 + 10000) % 10000;
		size++;
	}
	
	public static void push_back(int val) {
		back = (back + 1) % 10000;
		size++;
		deq[back] = val;
	}
	
	public static int pop_front() {
		if(size == 0)
			return -1;
		front = (front + 1) % 10000;
		int res = deq[front];
		size--;
		return res;
	}
	
	public static int pop_back() {
		if(size == 0)
			return -1;
		int res = deq[back];
		back = (back - 1 + 10000) % 10000;
		size--;
		return res;
	}
	
	public static int size() {
		return size;
	}
	
	public static int empty() {
		return size == 0 ? 1 : 0;
	}
	
	public static int front() {
		if(size == 0)
			return -1;
		return deq[(front + 1) % 10000];
	}
	
	public static int back() {
		if(size == 0)
			return -1;
		return deq[back];
	}
}
