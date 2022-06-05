package doit.first;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem11003 {
	
	public static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		Deque<Node> myDeque = new LinkedList<>();
		
		for(int i=0; i<N; i++) {
			int now = Integer.parseInt(st.nextToken());
			
			while(!myDeque.isEmpty() && myDeque.getLast().value > now) {
				myDeque.removeLast();
			}
			
			myDeque.addLast(new Node(now, i));
			
			if(myDeque.getFirst().index <= i - L) {
				myDeque.removeFirst();
			}
			bw.write(myDeque.getFirst().value + " ");
		}
		bw.flush();
		bw.close();
		
	}
	
	static class Node{
		public int value;
		public int index;
		
		Node(int value, int index){
			this.value = value;
			this.index = index;
		}
	}

}
