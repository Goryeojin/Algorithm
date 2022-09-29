package study.LinkedList;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Josephus1158 {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		LinkedList<Integer> list = new LinkedList<>();
		
		for(int i=1; i<=n; i++) {
			list.add(i);
		}
		
		sb.append("<");
		
		int idx = 0;
		while(list.size() > 1) {
			idx = (idx + (k - 1)) % list.size();
			
			sb.append(list.remove(idx)).append(", ");
		}
		
		sb.append(list.remove()).append(">");
		System.out.println(sb);
	}

}
