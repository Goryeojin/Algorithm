package backjon.step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem2525 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		// �� ��° �ٿ� ����ؾ� �ϴ� ������ StringTokenizer�� �ƴ� �⺻ �Է� ���
		int C = Integer.parseInt(br.readLine());
		
		// 1�ð��� 60���̱� ������ C�п� 60�� ������ ���� ��� �������� �� ��, �п� �ջ�
		A += C / 60;
		B += C % 60;
		
		// B���� 60�� �̻��̸� A�ÿ� 1�ð� �߰� �� B�п��� 60�� ����
		if(B>=60) {
			A += 1;
			B -= 60;
		}
		// A�ð� 24�ð� �̻��̸� A���� 24�ð� ����
		if(A > 23) {
			A -= 24;
		}
		// ��� ������ �ΰ� ��� ���
		System.out.println(A + " " + B);
		
	}

}
