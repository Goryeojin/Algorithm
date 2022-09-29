package study.LinkedList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.ListIterator;

public class KeyLogger5397 {
	
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			LinkedList<Character> list = new LinkedList<>();
			ListIterator<Character> iter = list.listIterator();
			String str = br.readLine();
			
			for(int j=0; j<str.length(); j++) {
				switch(str.charAt(j)) {
				case '<' :
					if(iter.hasPrevious())
						iter.previous();
					break;
				case '>' :
					if(iter.hasNext())
						iter.next();
					break;
				case '-' :
					if(iter.hasPrevious()) {
						iter.previous();
						iter.remove();
					}
					break;
				default :
					iter.add(str.charAt(j));
					break;
				}
			}
			
			StringBuilder sb = new StringBuilder();
			for(char c : list) {
				sb.append(c);
			}
			System.out.println(sb.toString());
		}
		
	}

}
