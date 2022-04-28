package backjon.step03;

import java.util.Arrays;
import java.util.Scanner;

public class Problem10950 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] resultArr = new int[num];
		
		for(int i=0; i<num; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			resultArr[i] = a+b;
		}
		
		for(int i=0; i<resultArr.length; i++) {
			System.out.println(resultArr[i]);
		}
	}

}
