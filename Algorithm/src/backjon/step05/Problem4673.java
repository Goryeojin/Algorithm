package backjon.step05;

public class Problem4673 {
	
	public static void main(String[] args) {
		
		boolean[] check = new boolean[10001];
		
		for(int i=1; i<=10000; i++) {
			int n = d(i);
			
			if(n < 10001) {
				check[n] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=10000; i++) {
			if(!check[i]) {
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}
	
	public static int d(int number) {
		int sum = number;
		
		while(number != 0) {
			sum = sum + (number % 10);	// ù ° �ڸ���
			number = number / 10;		// 10�� ������ ù ° �ڸ����� ���ش�.
		}
		
		return sum;
	}

}