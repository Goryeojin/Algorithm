package backjon.step06;

import java.util.Scanner;

public class Problem2941 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		sc.close();
		
		String croatia[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(int i=0; i<croatia.length; i++) {
			
			for(int j=0; j<croatia.length; j++) {
				
				if(str.contains(croatia[j])) {
					
					str = str.replace(croatia[j], "a");
				}
			}
		}
		
		System.out.println(str.length());
		
	}
}