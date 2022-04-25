package backjon.step01;

import java.util.Scanner;

public class Problem2588 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String num1 = sc.nextLine();
		String num2 = sc.nextLine();
		
		sc.close();
		
		int var4 = Integer.parseInt(String.valueOf(num2.charAt(0)));
		int var5 = Integer.parseInt(String.valueOf(num2.charAt(1)));
		int var6 = Integer.parseInt(String.valueOf(num2.charAt(2)));
		System.out.println(472%10);
		System.out.println(Integer.parseInt(num1) * var6);
		System.out.println(Integer.parseInt(num1) * var5);
		System.out.println(Integer.parseInt(num1) * var4);
		System.out.println(Integer.parseInt(num1) * Integer.parseInt(num2));
	}

}
