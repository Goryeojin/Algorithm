package backjon.step06;

import java.util.Scanner;

public class Problem5622 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		sc.close();
		
		int sec = 0;
		
		for(int i=0; i<str.length(); i++) {
			
			switch (str.charAt(i)) {
				
			case 'A' : case 'B' : case 'C' :
				sec += 3;
				break;
			case 'D' : case 'E' : case 'F' :
				sec += 4;
				break;
			case 'G' : case 'H' : case 'I' :
				sec += 5;
				break;
			case 'J' : case 'K' : case 'L' :
				sec += 6;
				break;
			case 'M' : case 'N' : case 'O' :
				sec += 7;
				break;
			case 'P' : case 'Q' : case 'R' : case 'S' :
				sec += 8;
				break;
			case 'T' : case 'U' : case 'V' :
				sec += 9;
				break;
			case 'W' : case 'X' : case 'Y' : case 'Z' :
				sec += 10;
				break;
			}
		}
		
		System.out.println(sec);
		
	}

}
