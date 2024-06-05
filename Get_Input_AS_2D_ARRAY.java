package raseeth_java;

import java.util.Scanner;

public class Get_Input_AS_2D_ARRAY {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter teh Row");
		int row = sc.nextInt();
		
		System.out.println("Enter teh Row");
		int col = sc.nextInt();
		
		int arr[][] = new int [row][col];
		System.out.println("Enter the Elements :");
		for(int i = 0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
//Sample Input
//Enter teh Row
//3
//Enter teh Row
//3
//Enter the Elements :
//1
//2
//3
//4
//5
//6
//7
//8
//9
//Expected output
//1 2 3 
//4 5 6 
//7 8 9 



