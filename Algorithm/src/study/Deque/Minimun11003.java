package study.Deque;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Minimun11003 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		Deque<Node> deq = new LinkedList<>();
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			int now = Integer.parseInt(st.nextToken());
			
			while(!deq.isEmpty() && deq.getLast().val > now) {
				deq.removeLast();
			}
			
			deq.addLast(new Node(i, now));
			
			if(deq.getFirst().idx <= i - L) {
				deq.removeFirst();
			}
			bw.write(deq.getFirst().val + " ");
		}
		bw.flush();
		bw.close();
	}
}
class Node {
	int idx;
	int val;
	
	Node(int idx, int val) {
		this.idx = idx;
		this.val = val;
	}
}
