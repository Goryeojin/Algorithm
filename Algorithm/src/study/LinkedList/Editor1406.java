package study.LinkedList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.ListIterator;

public class Editor1406 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int m = Integer.parseInt(br.readLine());
		
		LinkedList<Character> ll = new LinkedList<>();
		
		for(int i=0; i<str.length(); i++) {
			ll.add(str.charAt(i));
		}
		
		ListIterator<Character> iter = ll.listIterator();
		while(iter.hasNext())
			iter.next();
		
		int idx = ll.size();
		
		for(int i=0; i<m; i++) {
			String cmd = br.readLine();
			char c = cmd.charAt(0);
			
			switch(c) {
			
			case 'L' :
				if(iter.hasPrevious())
					iter.previous();
				break; //커서를 왼쪽으로 한 칸 옮김(커서가 문장의 맨 앞이면 무시됨)
				
			case 'D' :
				if(iter.hasNext())
					iter.next();
				break; //커서를 오른쪽으로 한 칸 옮김 (커서가 문장의 맨 뒤이면 무시됨)
				
			case 'B' :
				if(iter.hasPrevious()) {
					iter.previous();
					iter.remove();
				}
				break; //커서 왼쪽에 있는 문자를 삭제함 (커서가 문장의 맨 앞이면 무시됨)
						//삭제로 인해 커서는 한 칸 왼쪽으로 이동한 것처럼 나타나지만,
						//실제로 커서의 오른쪽에 있던 문자는 그대로임
				
			case 'P' :
				char t = cmd.charAt(2);
				iter.add(t);
				//$라는 문자를 커서 왼쪽에 추가함
				break;
			default :
				break;
			}
		}
		for(char c : ll) {
			bw.write(c);
		}
		
		bw.flush();
		bw.close();
	}

}
