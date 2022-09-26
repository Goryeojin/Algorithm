package study;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
	
	static int[] arr = new int[10];
	static int len;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<6; i++) {
			arr[i] = sc.nextInt();
		}
		len = 6;
		insert(3, 60, arr, len);
		System.out.println(Arrays.toString(arr));
		erase(4, arr, len);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void insert(int idx, int num, int[] arr, int len) {
		
		for(int i=len; i>idx; i--) {
			arr[i] = arr[i - 1];
		}
		arr[idx] = num;
		ArrayTest.len++;
	}
	
	public static void erase(int idx, int[] arr, int len) {
		ArrayTest.len--;
		for(int i=idx; i<len; i++) {
			arr[i] = arr[i + 1];
		}
	}

}
