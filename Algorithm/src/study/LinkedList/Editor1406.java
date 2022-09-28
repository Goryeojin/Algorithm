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
				break; //Ŀ���� �������� �� ĭ �ű�(Ŀ���� ������ �� ���̸� ���õ�)
				
			case 'D' :
				if(iter.hasNext())
					iter.next();
				break; //Ŀ���� ���������� �� ĭ �ű� (Ŀ���� ������ �� ���̸� ���õ�)
				
			case 'B' :
				if(iter.hasPrevious()) {
					iter.previous();
					iter.remove();
				}
				break; //Ŀ�� ���ʿ� �ִ� ���ڸ� ������ (Ŀ���� ������ �� ���̸� ���õ�)
						//������ ���� Ŀ���� �� ĭ �������� �̵��� ��ó�� ��Ÿ������,
						//������ Ŀ���� �����ʿ� �ִ� ���ڴ� �״����
				
			case 'P' :
				char t = cmd.charAt(2);
				iter.add(t);
				//$��� ���ڸ� Ŀ�� ���ʿ� �߰���
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
