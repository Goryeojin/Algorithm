package backjon.step03;

import java.util.Scanner;

public class Problem2438 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
				if(j == i) {
					System.out.println();
				}
			}
		}
	}

}
