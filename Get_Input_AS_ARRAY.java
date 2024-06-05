package raseeth_java;

import java.util.Scanner;

public class Get_Input_AS_ARRAY {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Element you want to store");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the Elements :");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
