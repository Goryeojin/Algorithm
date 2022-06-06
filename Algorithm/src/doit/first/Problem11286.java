package doit.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Problem11286 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/* �켱���� ť ����� ���밪 �� ���ϱ�
		 * 
			N ���� ��û ����
			�켱���� ť ����
			- ���� �������� ���ĵǵ���
			- ������ ������ ���� �켱 ����
			for(N) {
				��û 0�� �� : ť�� ��� �ִٸ� 0, �ƴϸ� ť�� front�� ��� poll()
				��û 1�̻� : ���ο� �����͸� �켱���� ť�� ���ϱ� add()
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1, o2) -> {
			int first_abs = Math.abs(o1);
			int second_abs = Math.abs(o2);
			if(first_abs == second_abs)
				return o1 > o2 ? 1 : -1;		// ���� ������ ���� �켱 ����
			else
				return first_abs - second_abs;	// ���� �������� ����
		});
		for(int i=0; i<N; i++) {
			int request = Integer.parseInt(br.readLine());
			if(request == 0) {
				if(myQueue.isEmpty()) {
					System.out.println("0");
				} else {
					System.out.println(myQueue.poll());
				}
			} else {
				myQueue.add(request);
			}
		}
		
		
	}

}
