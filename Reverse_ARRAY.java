package raseeth_java;

import java.util.Scanner;

public class Reverse_ARRAY {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Array");
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the Array");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int start = 0 ,end = n-1;
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
