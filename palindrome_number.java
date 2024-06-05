package raseeth_java;

import java.util.Scanner;

public class palindrome_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int a = sc.nextInt();
		
		int number = a;
		int reverse = 0;
		
		while(number != 0) {
			int digit = number % 10;
			reverse = reverse * 10 + digit;
			number = number / 10;
		}
		
		if(a == reverse) {
			System.out.println("The Number is Palindrome "+a);
		}
		
		else {
			System.out.println("The Number is Not Palindrome "+a);
		}
		

	}

}
