package backjon.step04;

import java.io.IOException;
import java.util.Scanner;

public class Problem1546 {
	public static void main(String[] args) throws IOException {
		/*
		�ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����. �� ���� M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.

		���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.

		�������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		ù° �ٿ� ���� �� ������ ���� N�� �־�����. �� ���� 1000���� �۰ų� ����. ��° �ٿ� �������� ���� ������ �־�����
		*/
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double[] arr = new double[Integer.parseInt(br.readLine())];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		double sum = 0;
		
		for(double value : arr) {
			sum += value/arr[arr.length-1]*100;
		}
		
		System.out.println(sum/arr.length);
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		long sum = 0;
		long max = 0;
		
		for(int i=0; i<N; i++) {
			if(A[i] > max) max = A[i];
			sum += A[i];
		}
		
		System.out.println(sum * 100.0 / max / N);
	}

}
