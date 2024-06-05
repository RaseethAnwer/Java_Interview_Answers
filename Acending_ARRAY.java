package raseeth_java;

import java.util.Scanner;

public class Acending_ARRAY {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Element you want to store");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the Elements :");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
			}
		}
	}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}
}
//Sample Input
//Enter the Number of Element you want to store
//5
//Enter the Elements :
//5
//4
//3
//2
//1
//Expected Output
//1 2 3 4 5 
