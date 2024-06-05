package raseeth_java;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int number = sc.nextInt();
		// 5 ! = 1 * 2 * 3 * 4 * 5 = 120
		int fact = 1;
		
		for(int i=1;i<=number;i++) {
			
			fact = fact * i;

		}
		
		System.out.println("Factorial "+fact);
	}

}
