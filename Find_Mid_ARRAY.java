package raseeth_java;

import java.util.Scanner;

public class Find_Mid_ARRAY {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Array");
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the Array");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		if(n % 2 == 1) {
			//if ODD
			int mid = n /2;
			System.out.println("Middle Element "+arr[mid]);
		}
		else {
			int mid1 = n/2 -1;
			int mid2 = n/2;
			System.out.println("Middle Element "+arr[mid1]+" and "+arr[mid2]);
		}
	}
}
//Input
//Enter the Number of Array
//5
//Enter the Array
//1 2 3 4 5
//Output
//Middle Element 3

